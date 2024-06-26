package de.htw.productmicroservice.port.producer;

import de.htw.productmicroservice.config.RabbitMQConfig;
import de.htw.productmicroservice.core.domain.model.Product;
import de.htw.productmicroservice.core.domain.service.interfaces.IBasketProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import java.util.UUID;


@Component
@Slf4j
public class BasketProducer implements IBasketProducer {

    private final RabbitTemplate productTemplate;

    public BasketProducer(RabbitTemplate productTemplate) {
        this.productTemplate = productTemplate;
    }

    @Override
    public void triggerAddProductToBasketEvent(Product product, UUID basketId, int quantity) {
        ProductMessage message = ProductMapper.toProductMessage(product, basketId, quantity);
        log.info(String.format("Sending product to basket: %s", message.toString()) );
        productTemplate.convertAndSend(RabbitMQConfig.PRODUCT_EXCHANGE, "product.add", message);
    }

}
