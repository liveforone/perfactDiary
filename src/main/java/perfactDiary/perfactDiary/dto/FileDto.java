package perfactDiary.perfactDiary.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import perfactDiary.perfactDiary.domain.File;

@Data
@NoArgsConstructor
public class FileDto {

    private Long id;
    private String origFilename;
    private String filename;
    private String filePath;

    public File toEntity() {
        File build = File.builder()
                .id(id)
                .origFilename(origFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
        return build;
    }

    @Builder
    public FileDto(Long id, String origFilename, String filename, String filePath) {
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
