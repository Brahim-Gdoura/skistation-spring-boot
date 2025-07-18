package tn.fst.spring.skistation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.fst.spring.skistation.repositories.SubscriptionRepository;
import tn.fst.spring.skistation.entities.Subscription;

import java.util.List;

@Service
@Slf4j
public class SubscriptionServiceImpl implements ISubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public List<Subscription> retrieveAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    @Override
    public Subscription addOrUpdateSubscription(Subscription subscription) {
        log.info("Adding/Updating subscription: " + subscription.toString());
        return subscriptionRepository.save(subscription);
    }

    @Override
    public void removeSubscription(Long numSub) {
        subscriptionRepository.deleteById(numSub);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }
}
