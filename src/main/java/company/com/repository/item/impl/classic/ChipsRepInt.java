package company.com.repository.item.impl.classic;

import company.com.domain.item.impl.classic.impl.Chips;
import company.com.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsRepInt extends JpaRepository<Chips,String> {
}
