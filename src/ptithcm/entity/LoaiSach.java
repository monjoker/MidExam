package ptithcm.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class LoaiSach {
	@Id
	@GeneratedValue
	private int IdLoai;
	private String TenLoai;
	@OneToMany(mappedBy = "loaiSach", fetch = FetchType.EAGER)
	private Collection<Sach> Sach;

	public LoaiSach() {
		super();
	}

	public int getIdLoai() {
		return IdLoai;
	}

	public void setIdLoai(int idLoai) {
		IdLoai = idLoai;
	}

	public String getTenLoai() {
		return TenLoai;
	}

	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}

	public Collection<Sach> getSach() {
		return Sach;
	}

	public void setSach(Collection<Sach> sach) {
		Sach = sach;
	}
}
