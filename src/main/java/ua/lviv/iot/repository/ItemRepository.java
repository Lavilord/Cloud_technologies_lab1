package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
}
