package service.impl;

import service.PendaftaranService;

public class PendaftaranServiceImpl implements PendaftaranService
	{
	@Override
	public String Nama(String mahasiswa)
		{
		return mahasiswa;
		}
	
	@Override
	public Integer Nilai(int ujian)
		{
		return ujian;
		}

	}
