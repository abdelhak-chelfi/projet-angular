package ma.emsi.projetangular.repositories;

import ma.emsi.projetangular.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String > {

}
