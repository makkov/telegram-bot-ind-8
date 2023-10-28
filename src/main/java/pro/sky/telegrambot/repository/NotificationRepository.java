package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.sky.telegrambot.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
