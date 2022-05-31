package perfactDiary.perfactDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perfactDiary.perfactDiary.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
