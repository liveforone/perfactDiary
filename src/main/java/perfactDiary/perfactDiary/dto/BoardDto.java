package perfactDiary.perfactDiary.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import perfactDiary.perfactDiary.domain.Board;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class BoardDto {

    private Long id;
    private String title;
    private String content;
    private String author;
    private Long fileId;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public Board toEntity() {
        Board build = Board.builder()
                .id(id)
                .author(author)
                .title(title)
                .content(content)
                .fileId(fileId)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String title, String content, String author, Long fileId, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.fileId = fileId;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
