package sg.edu.ntu.simplecrmpostgres312;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    
}
