package Java8;
import java.util.Optional;

public class OptionalClass {
	
	private Integer id;
	
	private String title;
	
	private boolean closed;
	
	public OptionalProgress progress;
	
	public Optional<OptionalProgress> getProgress() {
		return Optional.ofNullable(progress);
	}

	public void setProgress(OptionalProgress progress) {
		this.progress = progress;
	}

	public OptionalClass(Integer id, String title, boolean closed) {
		this.id = id;
		this.title = title;
		this.closed = closed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}	

}
