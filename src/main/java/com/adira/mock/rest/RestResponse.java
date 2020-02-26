package com.adira.mock.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

@RestController
@RequestMapping("/api")
public class RestResponse {
	
  @PostMapping("test/gson")
  public JsonElement parse() throws JsonSyntaxException {
	   String str = "{\r\n" + 
	   		"    \"header\": {\r\n" + 
	   		"        \"code\": \"ESB-00-000\",\r\n" + 
	   		"        \"message\": \"Permintaan berhasil diproses\",\r\n" + 
	   		"        \"srcCode\": \"200\",\r\n" + 
	   		"        \"srcMessage\": \"\",\r\n" + 
	   		"        \"addInfo\": {\r\n" + 
	   		"            \"requestId\": \"8c761d2a-7fe2-4d56-8401-53ba9680c48a\",\r\n" + 
	   		"            \"requestTimestamp\": \"2020-02-11 18:22:27\",\r\n" + 
	   		"            \"refNo\": \"20200211182227624315821723937936\",\r\n" + 
	   		"            \"srcTarget\": \"0\"\r\n" + 
	   		"        }\r\n" + 
	   		"    },\r\n" + 
	   		"    \"data\": {\r\n" + 
	   		"        \"data\": [\r\n" + 
	   		"            {\r\n" + 
	   		"                \"amountAktifDurable\": \"0.0\",\r\n" + 
	   		"                \"amountAktifMobil\": \"0.0\",\r\n" + 
	   		"                \"amountAktifMotor\": \"0.0\",\r\n" + 
	   		"                \"amountDurable\": \"0.0\",\r\n" + 
	   		"                \"amountMobil\": \"0.0\",\r\n" + 
	   		"                \"amountMotor\": \"959000.0\",\r\n" + 
	   		"                \"brmsOid\": \"02121321884325\",\r\n" + 
	   		"                \"denda\": \"0.0\",\r\n" + 
	   		"                \"installment\": \"0.0\",\r\n" + 
	   		"                \"instDurable\": \"\",\r\n" + 
	   		"                \"instMobil\": \"\",\r\n" + 
	   		"                \"instMotor\": \"12\",\r\n" + 
	   		"                \"kelurahanDurable\": \"\",\r\n" + 
	   		"                \"kelurahanMobil\": \"\",\r\n" + 
	   		"                \"kelurahanMotor\": \"89333\",\r\n" + 
	   		"                \"lastAngsuran\": \"\",\r\n" + 
	   		"                \"lastTenor\": \"\",\r\n" + 
	   		"                \"lastTenorContract\": \"12\",\r\n" + 
	   		"                \"maxOd\": \"0\",\r\n" + 
	   		"                \"maxTglRepoLain\": \"\",\r\n" + 
	   		"                \"maxTglRepoMobil\": \"\",\r\n" + 
	   		"                \"maxTglRepoMotor\": \"\",\r\n" + 
	   		"                \"maxTglWoDurable\": \"\",\r\n" + 
	   		"                \"maxTglWoLain\": \"\",\r\n" + 
	   		"                \"maxTglWoMobil\": \"\",\r\n" + 
	   		"                \"maxTglWoMotor\": \"\",\r\n" + 
	   		"                \"od0\": \"0\",\r\n" + 
	   		"                \"od1\": \"0\",\r\n" + 
	   		"                \"od2\": \"0\",\r\n" + 
	   		"                \"od3\": \"0\",\r\n" + 
	   		"                \"od4\": \"0\",\r\n" + 
	   		"                \"od5\": \"0\",\r\n" + 
	   		"                \"od6\": \"0\",\r\n" + 
	   		"                \"od7\": \"0\",\r\n" + 
	   		"                \"od8\": \"0\",\r\n" + 
	   		"                \"od9\": \"0\",\r\n" + 
	   		"                \"od10\": \"0\",\r\n" + 
	   		"                \"od11\": \"0\",\r\n" + 
	   		"                \"od12\": \"0\",\r\n" + 
	   		"                \"odLast6Drbl\": \"0\",\r\n" + 
	   		"                \"odLast6Mbl\": \"0\",\r\n" + 
	   		"                \"odLast6Mtr\": \"4\",\r\n" + 
	   		"                \"otrDurable\": \"\",\r\n" + 
	   		"                \"otrMobil\": \"\",\r\n" + 
	   		"                \"otrMotor\": \"13000000\",\r\n" + 
	   		"                \"phDurable\": \"\",\r\n" + 
	   		"                \"phMobil\": \"\",\r\n" + 
	   		"                \"phMotor\": \"9537000\",\r\n" + 
	   		"                \"plAktif\": \"0.0\",\r\n" + 
	   		"                \"tenorAktifDurable\": \"0\",\r\n" + 
	   		"                \"tenorAktifMobil\": \"0\",\r\n" + 
	   		"                \"tenorAktifMotor\": \"0\",\r\n" + 
	   		"                \"tenorLunasDurable\": \"0\",\r\n" + 
	   		"                \"tenorLunasMobil\": \"0\",\r\n" + 
	   		"                \"tenorLunasMotor\": \"12\",\r\n" + 
	   		"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
	   		"                \"tglMaxLunasMbl\": \"\",\r\n" + 
	   		"                \"tglMaxLunasMtr\": \"07-12-0006\",\r\n" + 
	   		"                \"tglReject\": \"\",\r\n" + 
	   		"                \"totalInstalment\": \"0.0\",\r\n" + 
	   		"                \"tunggakan\": \"0.0\",\r\n" + 
	   		"                \"zipCodeDurable\": \"\",\r\n" + 
	   		"                \"zipCodeMobil\": \"\",\r\n" + 
	   		"                \"zipCodeMotor\": \"41555\"\r\n" + 
	   		"            },\r\n" + 
	   		"            {\r\n" + 
	   		"                \"amountAktifDurable\": \"775000.0\",\r\n" + 
	   		"                \"amountAktifMobil\": \"0.0\",\r\n" + 
	   		"                \"amountAktifMotor\": \"761000.0\",\r\n" + 
	   		"                \"amountDurable\": \"306000.0\",\r\n" + 
	   		"                \"amountMobil\": \"0.0\",\r\n" + 
	   		"                \"amountMotor\": \"862000.0\",\r\n" + 
	   		"                \"brmsOid\": \"\",\r\n" + 
	   		"                \"denda\": \"856285.0\",\r\n" + 
	   		"                \"installment\": \"0.0\",\r\n" + 
	   		"                \"instDurable\": \"5\",\r\n" + 
	   		"                \"instMobil\": \"\",\r\n" + 
	   		"                \"instMotor\": \"12\",\r\n" + 
	   		"                \"kelurahanDurable\": \"89333\",\r\n" + 
	   		"                \"kelurahanMobil\": \"\",\r\n" + 
	   		"                \"kelurahanMotor\": \"89333\",\r\n" + 
	   		"                \"lastAngsuran\": \"1\",\r\n" + 
	   		"                \"lastTenor\": \"15\",\r\n" + 
	   		"                \"lastTenorContract\": \"12\",\r\n" + 
	   		"                \"maxOd\": \"117\",\r\n" + 
	   		"                \"maxTglRepoLain\": \"\",\r\n" + 
	   		"                \"maxTglRepoMobil\": \"\",\r\n" + 
	   		"                \"maxTglRepoMotor\": \"\",\r\n" + 
	   		"                \"maxTglWoDurable\": \"\",\r\n" + 
	   		"                \"maxTglWoLain\": \"\",\r\n" + 
	   		"                \"maxTglWoMobil\": \"\",\r\n" + 
	   		"                \"maxTglWoMotor\": \"\",\r\n" + 
	   		"                \"od0\": \"0\",\r\n" + 
	   		"                \"od1\": \"29\",\r\n" + 
	   		"                \"od2\": \"60\",\r\n" + 
	   		"                \"od3\": \"90\",\r\n" + 
	   		"                \"od4\": \"117\",\r\n" + 
	   		"                \"od5\": \"28\",\r\n" + 
	   		"                \"od6\": \"39\",\r\n" + 
	   		"                \"od7\": \"38\",\r\n" + 
	   		"                \"od8\": \"41\",\r\n" + 
	   		"                \"od9\": \"7\",\r\n" + 
	   		"                \"od10\": \"11\",\r\n" + 
	   		"                \"od11\": \"8\",\r\n" + 
	   		"                \"od12\": \"12\",\r\n" + 
	   		"                \"odLast6Drbl\": \"0\",\r\n" + 
	   		"                \"odLast6Mbl\": \"0\",\r\n" + 
	   		"                \"odLast6Mtr\": \"0\",\r\n" + 
	   		"                \"otrDurable\": \"2700000\",\r\n" + 
	   		"                \"otrMobil\": \"\",\r\n" + 
	   		"                \"otrMotor\": \"10400000\",\r\n" + 
	   		"                \"phDurable\": \"2700000\",\r\n" + 
	   		"                \"phMobil\": \"\",\r\n" + 
	   		"                \"phMotor\": \"8474600\",\r\n" + 
	   		"                \"plAktif\": \"1.75228E7\",\r\n" + 
	   		"                \"tenorAktifDurable\": \"0\",\r\n" + 
	   		"                \"tenorAktifMobil\": \"0\",\r\n" + 
	   		"                \"tenorAktifMotor\": \"0\",\r\n" + 
	   		"                \"tenorLunasDurable\": \"12\",\r\n" + 
	   		"                \"tenorLunasMobil\": \"0\",\r\n" + 
	   		"                \"tenorLunasMotor\": \"18\",\r\n" + 
	   		"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
	   		"                \"tglMaxLunasMbl\": \"\",\r\n" + 
	   		"                \"tglMaxLunasMtr\": \"08-10-0031\",\r\n" + 
	   		"                \"tglReject\": \"\",\r\n" + 
	   		"                \"totalInstalment\": \"1536000.0\",\r\n" + 
	   		"                \"tunggakan\": \"5654999.0\",\r\n" + 
	   		"                \"zipCodeDurable\": \"41555\",\r\n" + 
	   		"                \"zipCodeMobil\": \"\",\r\n" + 
	   		"                \"zipCodeMotor\": \"41555\"\r\n" + 
	   		"            }\r\n" + 
	   		"        ]\r\n" + 
	   		"    }\r\n" + 
	   		"}";
	   
    return new JsonParser().parse(str).getAsJsonObject();
   }
	
	@PostMapping("pefindo/v1/getPefindoReport")
	public ResponseEntity<String> hello() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"    \"header\": {\r\n" + 
				"        \"code\": \"ESB-00-000\",\r\n" + 
				"        \"message\": \"Permintaan berhasil diproses\",\r\n" + 
				"        \"srcCode\": \"200\",\r\n" + 
				"        \"srcMessage\": \"\",\r\n" + 
				"        \"addInfo\": {\r\n" + 
				"            \"requestId\": \"8c761d2a-7fe2-4d56-8401-53ba9680c48a\",\r\n" + 
				"            \"requestTimestamp\": \"2020-02-11 18:22:27\",\r\n" + 
				"            \"refNo\": \"20200211182227624315821723937936\",\r\n" + 
				"            \"srcTarget\": \"0\"\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"data\": [\r\n" + 
				"            {\r\n" + 
				"                \"amountAktifDurable\": \"0.0\",\r\n" + 
				"                \"amountAktifMobil\": \"0.0\",\r\n" + 
				"                \"amountAktifMotor\": \"0.0\",\r\n" + 
				"                \"amountDurable\": \"0.0\",\r\n" + 
				"                \"amountMobil\": \"0.0\",\r\n" + 
				"                \"amountMotor\": \"959000.0\",\r\n" + 
				"                \"brmsOid\": \"02121321884325\",\r\n" + 
				"                \"denda\": \"0.0\",\r\n" + 
				"                \"installment\": \"0.0\",\r\n" + 
				"                \"instDurable\": \"\",\r\n" + 
				"                \"instMobil\": \"\",\r\n" + 
				"                \"instMotor\": \"12\",\r\n" + 
				"                \"kelurahanDurable\": \"\",\r\n" + 
				"                \"kelurahanMobil\": \"\",\r\n" + 
				"                \"kelurahanMotor\": \"89333\",\r\n" + 
				"                \"lastAngsuran\": \"\",\r\n" + 
				"                \"lastTenor\": \"\",\r\n" + 
				"                \"lastTenorContract\": \"12\",\r\n" + 
				"                \"maxOd\": \"0\",\r\n" + 
				"                \"maxTglRepoLain\": \"\",\r\n" + 
				"                \"maxTglRepoMobil\": \"\",\r\n" + 
				"                \"maxTglRepoMotor\": \"\",\r\n" + 
				"                \"maxTglWoDurable\": \"\",\r\n" + 
				"                \"maxTglWoLain\": \"\",\r\n" + 
				"                \"maxTglWoMobil\": \"\",\r\n" + 
				"                \"maxTglWoMotor\": \"\",\r\n" + 
				"                \"od0\": \"0\",\r\n" + 
				"                \"od1\": \"0\",\r\n" + 
				"                \"od2\": \"0\",\r\n" + 
				"                \"od3\": \"0\",\r\n" + 
				"                \"od4\": \"0\",\r\n" + 
				"                \"od5\": \"0\",\r\n" + 
				"                \"od6\": \"0\",\r\n" + 
				"                \"od7\": \"0\",\r\n" + 
				"                \"od8\": \"0\",\r\n" + 
				"                \"od9\": \"0\",\r\n" + 
				"                \"od10\": \"0\",\r\n" + 
				"                \"od11\": \"0\",\r\n" + 
				"                \"od12\": \"0\",\r\n" + 
				"                \"odLast6Drbl\": \"0\",\r\n" + 
				"                \"odLast6Mbl\": \"0\",\r\n" + 
				"                \"odLast6Mtr\": \"4\",\r\n" + 
				"                \"otrDurable\": \"\",\r\n" + 
				"                \"otrMobil\": \"\",\r\n" + 
				"                \"otrMotor\": \"13000000\",\r\n" + 
				"                \"phDurable\": \"\",\r\n" + 
				"                \"phMobil\": \"\",\r\n" + 
				"                \"phMotor\": \"9537000\",\r\n" + 
				"                \"plAktif\": \"0.0\",\r\n" + 
				"                \"tenorAktifDurable\": \"0\",\r\n" + 
				"                \"tenorAktifMobil\": \"0\",\r\n" + 
				"                \"tenorAktifMotor\": \"0\",\r\n" + 
				"                \"tenorLunasDurable\": \"0\",\r\n" + 
				"                \"tenorLunasMobil\": \"0\",\r\n" + 
				"                \"tenorLunasMotor\": \"12\",\r\n" + 
				"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMtr\": \"07-12-0006\",\r\n" + 
				"                \"tglReject\": \"\",\r\n" + 
				"                \"totalInstalment\": \"0.0\",\r\n" + 
				"                \"tunggakan\": \"0.0\",\r\n" + 
				"                \"zipCodeDurable\": \"\",\r\n" + 
				"                \"zipCodeMobil\": \"\",\r\n" + 
				"                \"zipCodeMotor\": \"41555\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"amountAktifDurable\": \"775000.0\",\r\n" + 
				"                \"amountAktifMobil\": \"0.0\",\r\n" + 
				"                \"amountAktifMotor\": \"761000.0\",\r\n" + 
				"                \"amountDurable\": \"306000.0\",\r\n" + 
				"                \"amountMobil\": \"0.0\",\r\n" + 
				"                \"amountMotor\": \"862000.0\",\r\n" + 
				"                \"brmsOid\": \"\",\r\n" + 
				"                \"denda\": \"856285.0\",\r\n" + 
				"                \"installment\": \"0.0\",\r\n" + 
				"                \"instDurable\": \"5\",\r\n" + 
				"                \"instMobil\": \"\",\r\n" + 
				"                \"instMotor\": \"12\",\r\n" + 
				"                \"kelurahanDurable\": \"89333\",\r\n" + 
				"                \"kelurahanMobil\": \"\",\r\n" + 
				"                \"kelurahanMotor\": \"89333\",\r\n" + 
				"                \"lastAngsuran\": \"1\",\r\n" + 
				"                \"lastTenor\": \"15\",\r\n" + 
				"                \"lastTenorContract\": \"12\",\r\n" + 
				"                \"maxOd\": \"117\",\r\n" + 
				"                \"maxTglRepoLain\": \"\",\r\n" + 
				"                \"maxTglRepoMobil\": \"\",\r\n" + 
				"                \"maxTglRepoMotor\": \"\",\r\n" + 
				"                \"maxTglWoDurable\": \"\",\r\n" + 
				"                \"maxTglWoLain\": \"\",\r\n" + 
				"                \"maxTglWoMobil\": \"\",\r\n" + 
				"                \"maxTglWoMotor\": \"\",\r\n" + 
				"                \"od0\": \"0\",\r\n" + 
				"                \"od1\": \"29\",\r\n" + 
				"                \"od2\": \"60\",\r\n" + 
				"                \"od3\": \"90\",\r\n" + 
				"                \"od4\": \"117\",\r\n" + 
				"                \"od5\": \"28\",\r\n" + 
				"                \"od6\": \"39\",\r\n" + 
				"                \"od7\": \"38\",\r\n" + 
				"                \"od8\": \"41\",\r\n" + 
				"                \"od9\": \"7\",\r\n" + 
				"                \"od10\": \"11\",\r\n" + 
				"                \"od11\": \"8\",\r\n" + 
				"                \"od12\": \"12\",\r\n" + 
				"                \"odLast6Drbl\": \"0\",\r\n" + 
				"                \"odLast6Mbl\": \"0\",\r\n" + 
				"                \"odLast6Mtr\": \"0\",\r\n" + 
				"                \"otrDurable\": \"2700000\",\r\n" + 
				"                \"otrMobil\": \"\",\r\n" + 
				"                \"otrMotor\": \"10400000\",\r\n" + 
				"                \"phDurable\": \"2700000\",\r\n" + 
				"                \"phMobil\": \"\",\r\n" + 
				"                \"phMotor\": \"8474600\",\r\n" + 
				"                \"plAktif\": \"1.75228E7\",\r\n" + 
				"                \"tenorAktifDurable\": \"0\",\r\n" + 
				"                \"tenorAktifMobil\": \"0\",\r\n" + 
				"                \"tenorAktifMotor\": \"0\",\r\n" + 
				"                \"tenorLunasDurable\": \"12\",\r\n" + 
				"                \"tenorLunasMobil\": \"0\",\r\n" + 
				"                \"tenorLunasMotor\": \"18\",\r\n" + 
				"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMtr\": \"08-10-0031\",\r\n" + 
				"                \"tglReject\": \"\",\r\n" + 
				"                \"totalInstalment\": \"1536000.0\",\r\n" + 
				"                \"tunggakan\": \"5654999.0\",\r\n" + 
				"                \"zipCodeDurable\": \"41555\",\r\n" + 
				"                \"zipCodeMobil\": \"\",\r\n" + 
				"                \"zipCodeMotor\": \"41555\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
}
