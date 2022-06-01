package perfactDiary.perfactDiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import perfactDiary.perfactDiary.domain.File;

public interface FileRepository extends JpaRepository<File, Long> {
}
