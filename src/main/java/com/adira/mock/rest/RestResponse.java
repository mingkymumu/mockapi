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
	
	@PostMapping("v1/getDedup")
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
				"            \"requestId\": \"7f8da659-8c2c-4ef5-bc55-c609472227fa\",\r\n" + 
				"            \"requestTimestamp\": \"2020-02-20 19:59:53\",\r\n" + 
				"            \"refNo\": \"20200221141147427433003044959851\",\r\n" + 
				"            \"srcTarget\": \"0\"\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"data\": [\r\n" + 
				"            {\r\n" + 
				"                \"amountAktifDurable\": \"0.0\",\r\n" + 
				"                \"amountAktifMobil\": \"0.0\",\r\n" + 
				"                \"amountAktifMotor\": \"400000.0\",\r\n" + 
				"                \"amountDurable\": \"0.0\",\r\n" + 
				"                \"amountMobil\": \"0.0\",\r\n" + 
				"                \"amountMotor\": \"400000.0\",\r\n" + 
				"                \"brmsOid\": \"02121003436912\",\r\n" + 
				"                \"denda\": \"0.0\",\r\n" + 
				"                \"installment\": \"0.0\",\r\n" + 
				"                \"instDurable\": \"\",\r\n" + 
				"                \"instMobil\": \"\",\r\n" + 
				"                \"instMotor\": \"0\",\r\n" + 
				"                \"kelurahanDurable\": \"\",\r\n" + 
				"                \"kelurahanMobil\": \"\",\r\n" + 
				"                \"kelurahanMotor\": \"89520\",\r\n" + 
				"                \"lastAngsuran\": \"\",\r\n" + 
				"                \"lastTenor\": \"\",\r\n" + 
				"                \"lastTenorContract\": \"35\",\r\n" + 
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
				"                \"odLast6Mtr\": \"0\",\r\n" + 
				"                \"otrDurable\": \"\",\r\n" + 
				"                \"otrMobil\": \"\",\r\n" + 
				"                \"otrMotor\": \"12015000\",\r\n" + 
				"                \"phDurable\": \"\",\r\n" + 
				"                \"phMobil\": \"\",\r\n" + 
				"                \"phMotor\": \"9590900\",\r\n" + 
				"                \"plAktif\": \"9590900.0\",\r\n" + 
				"                \"tenorAktifDurable\": \"0\",\r\n" + 
				"                \"tenorAktifMobil\": \"0\",\r\n" + 
				"                \"tenorAktifMotor\": \"0\",\r\n" + 
				"                \"tenorLunasDurable\": \"0\",\r\n" + 
				"                \"tenorLunasMobil\": \"0\",\r\n" + 
				"                \"tenorLunasMotor\": \"35\",\r\n" + 
				"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMtr\": \"\",\r\n" + 
				"                \"tglReject\": \"\",\r\n" + 
				"                \"totalInstalment\": \"0.0\",\r\n" + 
				"                \"tunggakan\": \"0.0\",\r\n" + 
				"                \"zipCodeDurable\": \"\",\r\n" + 
				"                \"zipCodeMobil\": \"\",\r\n" + 
				"                \"zipCodeMotor\": \"45153\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"amountAktifDurable\": \"1131000.0\",\r\n" + 
				"                \"amountAktifMobil\": \"0.0\",\r\n" + 
				"                \"amountAktifMotor\": \"0.0\",\r\n" + 
				"                \"amountDurable\": \"420000.0\",\r\n" + 
				"                \"amountMobil\": \"0.0\",\r\n" + 
				"                \"amountMotor\": \"0.0\",\r\n" + 
				"                \"brmsOid\": \"\",\r\n" + 
				"                \"denda\": \"6285.0\",\r\n" + 
				"                \"installment\": \"0.0\",\r\n" + 
				"                \"instDurable\": \"0\",\r\n" + 
				"                \"instMobil\": \"\",\r\n" + 
				"                \"instMotor\": \"\",\r\n" + 
				"                \"kelurahanDurable\": \"89520\",\r\n" + 
				"                \"kelurahanMobil\": \"\",\r\n" + 
				"                \"kelurahanMotor\": \"\",\r\n" + 
				"                \"lastAngsuran\": \"\",\r\n" + 
				"                \"lastTenor\": \"3\",\r\n" + 
				"                \"lastTenorContract\": \"12\",\r\n" + 
				"                \"maxOd\": \"2\",\r\n" + 
				"                \"maxTglRepoLain\": \"\",\r\n" + 
				"                \"maxTglRepoMobil\": \"\",\r\n" + 
				"                \"maxTglRepoMotor\": \"\",\r\n" + 
				"                \"maxTglWoDurable\": \"\",\r\n" + 
				"                \"maxTglWoLain\": \"\",\r\n" + 
				"                \"maxTglWoMobil\": \"\",\r\n" + 
				"                \"maxTglWoMotor\": \"\",\r\n" + 
				"                \"od0\": \"0\",\r\n" + 
				"                \"od1\": \"0\",\r\n" + 
				"                \"od2\": \"1\",\r\n" + 
				"                \"od3\": \"2\",\r\n" + 
				"                \"od4\": \"0\",\r\n" + 
				"                \"od5\": \"2\",\r\n" + 
				"                \"od6\": \"2\",\r\n" + 
				"                \"od7\": \"1\",\r\n" + 
				"                \"od8\": \"2\",\r\n" + 
				"                \"od9\": \"2\",\r\n" + 
				"                \"od10\": \"1\",\r\n" + 
				"                \"od11\": \"2\",\r\n" + 
				"                \"od12\": \"2\",\r\n" + 
				"                \"odLast6Drbl\": \"0\",\r\n" + 
				"                \"odLast6Mbl\": \"0\",\r\n" + 
				"                \"odLast6Mtr\": \"0\",\r\n" + 
				"                \"otrDurable\": \"3700000\",\r\n" + 
				"                \"otrMobil\": \"\",\r\n" + 
				"                \"otrMotor\": \"\",\r\n" + 
				"                \"phDurable\": \"3700000\",\r\n" + 
				"                \"phMobil\": \"\",\r\n" + 
				"                \"phMotor\": \"\",\r\n" + 
				"                \"plAktif\": \"1.019E7\",\r\n" + 
				"                \"tenorAktifDurable\": \"0\",\r\n" + 
				"                \"tenorAktifMobil\": \"0\",\r\n" + 
				"                \"tenorAktifMotor\": \"0\",\r\n" + 
				"                \"tenorLunasDurable\": \"12\",\r\n" + 
				"                \"tenorLunasMobil\": \"0\",\r\n" + 
				"                \"tenorLunasMotor\": \"0\",\r\n" + 
				"                \"tglMaxLunasDrbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMbl\": \"\",\r\n" + 
				"                \"tglMaxLunasMtr\": \"\",\r\n" + 
				"                \"tglReject\": \"\",\r\n" + 
				"                \"totalInstalment\": \"420000.0\",\r\n" + 
				"                \"tunggakan\": \"4200000.0\",\r\n" + 
				"                \"zipCodeDurable\": \"45153\",\r\n" + 
				"                \"zipCodeMobil\": \"\",\r\n" + 
				"                \"zipCodeMotor\": \"\"\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	
	
	@PostMapping("v1/getTelco")
	public ResponseEntity<String> telco() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"  \"header\": {\r\n" + 
				"    \"code\": \"ESB-00-000\",\r\n" + 
				"    \"message\": \"Permintaan berhasil diproses\",\r\n" + 
				"    \"srcCode\": \"00\",\r\n" + 
				"    \"srcMessage\": \"Success\",\r\n" + 
				"    \"addInfo\": {\r\n" + 
				"      \"requestId\": \"AD1CHECKING-201904181418112234\",\r\n" + 
				"      \"requestTimestamp\": \"2019-04-18 11:22:33\",\r\n" + 
				"      \"refNo\": \"20200214172701957605196446141576\",\r\n" + 
				"      \"srcTarget\": \"0\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"data\": {\r\n" + 
				"    \"result\": \"100\",\r\n" + 
				"    \"sessionId\": \"34793120200214945388164119295041\",\r\n" + 
				"    \"consentId\": \"20200214363320738347\"\r\n" + 
				"  }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	
	
	
	@PostMapping("v1/getBrms")
	public ResponseEntity<String> brms() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"  \"header\": {\r\n" + 
				"    \"code\": \"ESB-00-000\",\r\n" + 
				"    \"message\": \"Permintaan berhasil diproses\",\r\n" + 
				"    \"srcCode\": \"200\",\r\n" + 
				"    \"srcMessage\": \"OK\",\r\n" + 
				"    \"addInfo\": {\r\n" + 
				"      \"requestId\": \"Adck-20194113173022707900008\",\r\n" + 
				"      \"requestTimestamp\": \"2020-02-21 20:34:28\",\r\n" + 
				"      \"refNo\": \"20200221203428963727380541121716\",\r\n" + 
				"      \"srcTarget\": \"0\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"data\": {\r\n" + 
				"    \"result\": {\r\n" + 
				"      \"aosFlag\": \"false\",\r\n" + 
				"      \"eksternalSurveyFlag\": \"false\",\r\n" + 
				"      \"instantApprovalFlag\": \"false\",\r\n" + 
				"      \"officeSurveyFlag\": \"false\",\r\n" + 
				"      \"regularSurveyFlag\": \"false\",\r\n" + 
				"      \"resultSurvey\": \"7\",\r\n" + 
				"      \"teleSurveyFlag\": \"false\",\r\n" + 
				"      \"externalRegulerFlag\": \"false\",\r\n" + 
				"      \"regulerOfficeFlag\": \"false\",\r\n" + 
				"      \"teleExternalFlag\": \"false\",\r\n" + 
				"      \"teleRegulerFlag\": \"false\",\r\n" + 
				"      \"individualRuleResult\": {\r\n" + 
				"        \"result001\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G004\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000011301\"\r\n" + 
				"        },\r\n" + 
				"        \"result002\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G071\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result003\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G070\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result004\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"M007\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000015301\"\r\n" + 
				"        },\r\n" + 
				"        \"result005\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G005\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000021401\"\r\n" + 
				"        },\r\n" + 
				"        \"result006\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G084\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0085\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCR004\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"CKC220472601\"\r\n" + 
				"        },\r\n" + 
				"        \"result007\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G002\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MKC110031301\"\r\n" + 
				"        },\r\n" + 
				"        \"result008\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G045\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result009\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G016\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result010\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G038\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110011001\"\r\n" + 
				"        },\r\n" + 
				"        \"result011\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G012\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M020000011201\"\r\n" + 
				"        },\r\n" + 
				"        \"result012\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G006\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110010201\"\r\n" + 
				"        },\r\n" + 
				"        \"result013\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G010\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0110010301\"\r\n" + 
				"        },\r\n" + 
				"        \"result014\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G009\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M013050160401\"\r\n" + 
				"        },\r\n" + 
				"        \"result015\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"G003\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110010707\"\r\n" + 
				"        },\r\n" + 
				"        \"result016\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D008\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000124513\"\r\n" + 
				"        },\r\n" + 
				"        \"result017\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D007\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000125303\"\r\n" + 
				"        },\r\n" + 
				"        \"result018\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"G074\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125302\"\r\n" + 
				"        },\r\n" + 
				"        \"result019\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G004\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MKC110031207\"\r\n" + 
				"        },\r\n" + 
				"        \"result020\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G071\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result021\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"G070\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125302\"\r\n" + 
				"        },\r\n" + 
				"        \"result022\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"M007\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000015301\"\r\n" + 
				"        },\r\n" + 
				"        \"result023\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"G005\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MKC110031302\"\r\n" + 
				"        },\r\n" + 
				"        \"result024\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G084\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0085\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCR004\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"CKC220472601\"\r\n" + 
				"        },\r\n" + 
				"        \"result025\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"M008\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICR0108\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125302\"\r\n" + 
				"        },\r\n" + 
				"        \"result026\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G002\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MKC110031301\"\r\n" + 
				"        },\r\n" + 
				"        \"result027\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G045\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result028\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G016\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result029\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G038\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110011001\"\r\n" + 
				"        },\r\n" + 
				"        \"result030\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G012\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M020000011201\"\r\n" + 
				"        },\r\n" + 
				"        \"result031\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G006\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110010201\"\r\n" + 
				"        },\r\n" + 
				"        \"result032\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G010\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0110010301\"\r\n" + 
				"        },\r\n" + 
				"        \"result033\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G009\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M013050160404\"\r\n" + 
				"        },\r\n" + 
				"        \"result034\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G003\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD032A\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M000005100701\"\r\n" + 
				"        },\r\n" + 
				"        \"result035\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D008\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000124513\"\r\n" + 
				"        },\r\n" + 
				"        \"result036\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D007\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000125303\"\r\n" + 
				"        },\r\n" + 
				"        \"result037\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"G074\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125302\"\r\n" + 
				"        },\r\n" + 
				"        \"result038\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G004\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD05B\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000011201\"\r\n" + 
				"        },\r\n" + 
				"        \"result039\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G071\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD05B\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result040\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G070\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD05B\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result041\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"M007\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD05B\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000015301\"\r\n" + 
				"        },\r\n" + 
				"        \"result042\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G005\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"KSCRD05B\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"M020000021401\"\r\n" + 
				"        },\r\n" + 
				"        \"result043\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G084\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0085\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCR004\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"CKC220472601\"\r\n" + 
				"        },\r\n" + 
				"        \"result044\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G002\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MKC110031301\"\r\n" + 
				"        },\r\n" + 
				"        \"result045\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G045\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result046\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G016\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MICR0125\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125301\"\r\n" + 
				"        },\r\n" + 
				"        \"result047\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G038\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110011001\"\r\n" + 
				"        },\r\n" + 
				"        \"result048\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G012\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M020000011201\"\r\n" + 
				"        },\r\n" + 
				"        \"result049\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G006\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110010201\"\r\n" + 
				"        },\r\n" + 
				"        \"result050\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G010\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0110010301\"\r\n" + 
				"        },\r\n" + 
				"        \"result051\": {\r\n" + 
				"          \"approvalLevel\": \"1\",\r\n" + 
				"          \"argumentName\": \"G009\",\r\n" + 
				"          \"deviation\": \"No\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M013050160404\"\r\n" + 
				"        },\r\n" + 
				"        \"result052\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"G003\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MMKT0005\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM001\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"M00110010707\"\r\n" + 
				"        },\r\n" + 
				"        \"result053\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D008\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000124513\"\r\n" + 
				"        },\r\n" + 
				"        \"result054\": {\r\n" + 
				"          \"approvalLevel\": \"3\",\r\n" + 
				"          \"argumentName\": \"D007\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD001\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM049\",\r\n" + 
				"          \"policyType\": \"CR001\",\r\n" + 
				"          \"ruleId\": \"MK0000125303\"\r\n" + 
				"        },\r\n" + 
				"        \"result055\": {\r\n" + 
				"          \"approvalLevel\": \"5\",\r\n" + 
				"          \"argumentName\": \"G074\",\r\n" + 
				"          \"deviation\": \"Yes\",\r\n" + 
				"          \"miMemo\": \"MICRD803\",\r\n" + 
				"          \"note\": \"N00000\",\r\n" + 
				"          \"policyName\": \"PNCRM002\",\r\n" + 
				"          \"policyType\": \"CR003\",\r\n" + 
				"          \"ruleId\": \"MK0000125302\"\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"latestRuleResult\": {\r\n" + 
				"      \"result001\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G004\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"KSCRD05B\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"M020000011201\"\r\n" + 
				"      },\r\n" + 
				"      \"result002\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G071\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"KSCRD05B\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125301\"\r\n" + 
				"      },\r\n" + 
				"      \"result003\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G070\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"KSCRD05B\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125301\"\r\n" + 
				"      },\r\n" + 
				"      \"result004\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"M007\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"KSCRD05B\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"M020000015301\"\r\n" + 
				"      },\r\n" + 
				"      \"result005\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G005\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"KSCRD05B\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"M020000021401\"\r\n" + 
				"      },\r\n" + 
				"      \"result006\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G084\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MICR0085\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCR004\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"CKC220472601\"\r\n" + 
				"      },\r\n" + 
				"      \"result007\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G002\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MICRD803\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MKC110031301\"\r\n" + 
				"      },\r\n" + 
				"      \"result008\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G045\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MICR0125\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125301\"\r\n" + 
				"      },\r\n" + 
				"      \"result009\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G016\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MICR0125\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125301\"\r\n" + 
				"      },\r\n" + 
				"      \"result010\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G038\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"M00110011001\"\r\n" + 
				"      },\r\n" + 
				"      \"result011\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G012\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"M020000011201\"\r\n" + 
				"      },\r\n" + 
				"      \"result012\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G006\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"M00110010201\"\r\n" + 
				"      },\r\n" + 
				"      \"result013\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G010\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"MK0110010301\"\r\n" + 
				"      },\r\n" + 
				"      \"result014\": {\r\n" + 
				"        \"approvalLevel\": \"1\",\r\n" + 
				"        \"argumentName\": \"G009\",\r\n" + 
				"        \"deviation\": \"No\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"M013050160404\"\r\n" + 
				"      },\r\n" + 
				"      \"result015\": {\r\n" + 
				"        \"approvalLevel\": \"3\",\r\n" + 
				"        \"argumentName\": \"G003\",\r\n" + 
				"        \"deviation\": \"Yes\",\r\n" + 
				"        \"miMemo\": \"MMKT0005\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM001\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"M00110010707\"\r\n" + 
				"      },\r\n" + 
				"      \"result016\": {\r\n" + 
				"        \"approvalLevel\": \"3\",\r\n" + 
				"        \"argumentName\": \"D008\",\r\n" + 
				"        \"deviation\": \"Yes\",\r\n" + 
				"        \"miMemo\": \"MICRD001\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM049\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"MK0000124513\"\r\n" + 
				"      },\r\n" + 
				"      \"result017\": {\r\n" + 
				"        \"approvalLevel\": \"3\",\r\n" + 
				"        \"argumentName\": \"D007\",\r\n" + 
				"        \"deviation\": \"Yes\",\r\n" + 
				"        \"miMemo\": \"MICRD001\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM049\",\r\n" + 
				"        \"policyType\": \"CR001\",\r\n" + 
				"        \"ruleId\": \"MK0000125303\"\r\n" + 
				"      },\r\n" + 
				"      \"result018\": {\r\n" + 
				"        \"approvalLevel\": \"5\",\r\n" + 
				"        \"argumentName\": \"G074\",\r\n" + 
				"        \"deviation\": \"Yes\",\r\n" + 
				"        \"miMemo\": \"MICRD803\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125302\"\r\n" + 
				"      },\r\n" + 
				"      \"result019\": {\r\n" + 
				"        \"approvalLevel\": \"5\",\r\n" + 
				"        \"argumentName\": \"M008\",\r\n" + 
				"        \"deviation\": \"Yes\",\r\n" + 
				"        \"miMemo\": \"MICR0108\",\r\n" + 
				"        \"note\": \"N00000\",\r\n" + 
				"        \"policyName\": \"PNCRM002\",\r\n" + 
				"        \"policyType\": \"CR003\",\r\n" + 
				"        \"ruleId\": \"MK0000125302\"\r\n" + 
				"      }\r\n" + 
				"    },\r\n" + 
				"    \"scoreResult\": {\r\n" + 
				"      \"policyName\": \"ISC01\",\r\n" + 
				"      \"rekomendasi\": \"A.LOWEST\",\r\n" + 
				"      \"scoring\": \"295\"\r\n" + 
				"    },\r\n" + 
				"    \"catOutputChecking\": \"SLP\",\r\n" + 
				"    \"applicationDate\": \"2020-02-19\",\r\n" + 
				"    \"applicationNo\": \"0000200201000725\"\r\n" + 
				"  }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	@PostMapping("v1/getTsi")
	public ResponseEntity<String> tsi() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"  \"header\": {\r\n" + 
				"    \"code\": \"ESB-00-000\",\r\n" + 
				"    \"message\": \"Request is successfully processed\",\r\n" + 
				"    \"srcCode\": \"200\",\r\n" + 
				"    \"srcMessage\": \"credit score is available\",\r\n" + 
				"    \"addInfo\": {\r\n" + 
				"      \"requestId\": \"AD1CHECKING-201904181418112234\",\r\n" + 
				"      \"requestTimestamp\": \"2019-04-18 11:22:33\",\r\n" + 
				"      \"refNo\": \"20191231135050039581218272932227\",\r\n" + 
				"      \"srcTarget\": \"1\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"data\": {\r\n" + 
				"    \"requestId\": \"13568432\",\r\n" + 
				"    \"score\": \"850\",\r\n" + 
				"    \"scoreCategory\": \"A\",\r\n" + 
				"    \"verify\": \"new\",\r\n" + 
				"    \"timestamp\": \"2019-12-31T12:34:28+07:00\"\r\n" + 
				"  }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	@PostMapping("v1/getInstinct")
	public ResponseEntity<String> instinct() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"  \"header\": {\r\n" + 
				"    \"code\": \"ESB-00-000\",\r\n" + 
				"    \"message\": \"Permintaan berhasil diproses\",\r\n" + 
				"    \"srcCode\": \"\",\r\n" + 
				"    \"srcMessage\": \"\",\r\n" + 
				"    \"addInfo\": {\r\n" + 
				"      \"requestId\": \"7d628481-5788-4e2d-b601-72943b42ad03\",\r\n" + 
				"      \"requestTimestamp\": \"2020-02-17 15:57:35\",\r\n" + 
				"      \"refNo\": \"20200217155735356472402720972113\",\r\n" + 
				"      \"srcTarget\": \"-\"\r\n" + 
				"    }\r\n" + 
				"  },\r\n" + 
				"  \"data\": {\r\n" + 
				"    \"organization\": \"ADF\",\r\n" + 
				"    \"countryCode\": \"ID\",\r\n" + 
				"    \"applicationNumber\": \"ESBAD1CHECKING-0113454771\",\r\n" + 
				"    \"applicationType\": \"ESB\",\r\n" + 
				"    \"fraudScore\": \"60\",\r\n" + 
				"    \"fraudAlert\": \"S\",\r\n" + 
				"    \"ruleTriggered1\": \"B01\",\r\n" + 
				"    \"ruleTriggered2\": \"\",\r\n" + 
				"    \"ruleTriggered3\": \"\",\r\n" + 
				"    \"ruleTriggered4\": \"\",\r\n" + 
				"    \"ruleTriggered5\": \"\",\r\n" + 
				"    \"ruleTriggered6\": \"\",\r\n" + 
				"    \"ruleTriggered7\": \"\",\r\n" + 
				"    \"ruleTriggered8\": \"\",\r\n" + 
				"    \"ruleTriggered9\": \"\",\r\n" + 
				"    \"ruleTriggered10\": \"\",\r\n" + 
				"    \"ruleTriggered11\": \"\",\r\n" + 
				"    \"ruleTriggered12\": \"\",\r\n" + 
				"    \"ruleTriggered13\": \"\",\r\n" + 
				"    \"ruleTriggered14\": \"\",\r\n" + 
				"    \"ruleTriggered15\": \"\",\r\n" + 
				"    \"ruleTriggered16\": \"\",\r\n" + 
				"    \"ruleTriggered17\": \"\",\r\n" + 
				"    \"ruleTriggered18\": \"\",\r\n" + 
				"    \"ruleTriggered19\": \"\",\r\n" + 
				"    \"ruleTriggered20\": \"\",\r\n" + 
				"    \"minTriggeredRules\": \"B01\",\r\n" + 
				"    \"maxTriggeredRules\": \"B05\",\r\n" + 
				"    \"matchApplicationNumber\": \"0000200201000333\",\r\n" + 
				"    \"matchApplicationType\": \"001\",\r\n" + 
				"    \"matchApplicationDate\": \"21/01/2020\",\r\n" + 
				"    \"matchFraudAlert\": \"S\",\r\n" + 
				"    \"matchTriggerRules\": \"B01,B05\"\r\n" + 
				"  }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	
	@PostMapping("v1/getPefindo")
	public ResponseEntity<String> pefindo() {
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.set("Content-Type", 
		      "application/json");
		String str = "{\r\n" + 
				"    \"header\": {\r\n" + 
				"        \"code\": \"ESB-00-000\",\r\n" + 
				"        \"message\": \"Request is successfully processed\",\r\n" + 
				"        \"srcCode\": \"200\",\r\n" + 
				"        \"srcMessage\": \"ReportGenerated\",\r\n" + 
				"        \"addInfo\": {\r\n" + 
				"            \"requestId\": \"d0ca5b6b-fc2c-465c-a2c5-8b599ede7e7f\",\r\n" + 
				"            \"requestTimestamp\": \"2020-02-11 17:28:49\",\r\n" + 
				"            \"refNo\": \"20200221153424295113995174802425\",\r\n" + 
				"            \"srcTarget\": \"0\"\r\n" + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"dataCustomer\": {\r\n" + 
				"            \"nama\": \"Suhartini\",\r\n" + 
				"            \"nik\": \"3209316003740004\",\r\n" + 
				"            \"npwp\": \"000000000000000\",\r\n" + 
				"            \"zipCode\": \"41555\",\r\n" + 
				"            \"kelurahan\": \"Depok\",\r\n" + 
				"            \"jumlahPefindoId\": \"1\",\r\n" + 
				"            \"similiarityRate\": {\r\n" + 
				"                \"data\": [\r\n" + 
				"                    {\r\n" + 
				"                        \"pefindoId\": \"2652901680\",\r\n" + 
				"                        \"score\": \"41\"\r\n" + 
				"                    }\r\n" + 
				"                ]\r\n" + 
				"            }\r\n" + 
				"        },\r\n" + 
				"        \"detailKontrakAktif\": [\r\n" + 
				"            {\r\n" + 
				"                \"pemberiKredit\": \"PT. Adira Dinamika Multi Finance\",\r\n" + 
				"                \"tipeFasilitas\": \"CoFinancing\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"26/04/2017\",\r\n" + 
				"                \"akhirKontrak\": \"26/04/2018\",\r\n" + 
				"                \"pengkinianTerakhir\": \"30/11/2017\",\r\n" + 
				"                \"sisaTenor\": \"5\",\r\n" + 
				"                \"fasilitasAwal\": \"0\",\r\n" + 
				"                \"phOutstanding\": \"0\",\r\n" + 
				"                \"angsuran\": \"0\",\r\n" + 
				"                \"nominalTunggakan\": \"0\",\r\n" + 
				"                \"ovdAngsuranTerakhir\": \"0\",\r\n" + 
				"                \"ovdMax1thTerakhir\": \"0\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"0\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiKredit\": \"PT. Adira Dinamika Multi Finance\",\r\n" + 
				"                \"tipeFasilitas\": \"OtherWithLoanAgreement\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"13/11/2018\",\r\n" + 
				"                \"akhirKontrak\": \"13/05/2020\",\r\n" + 
				"                \"pengkinianTerakhir\": \"31/12/2019\",\r\n" + 
				"                \"sisaTenor\": \"5\",\r\n" + 
				"                \"fasilitasAwal\": \"0\",\r\n" + 
				"                \"phOutstanding\": \"3474582\",\r\n" + 
				"                \"angsuran\": \"724727\",\r\n" + 
				"                \"nominalTunggakan\": \"0\",\r\n" + 
				"                \"ovdAngsuranTerakhir\": \"0\",\r\n" + 
				"                \"ovdMax1thTerakhir\": \"0\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"0\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiKredit\": \"PT. Adira Dinamika Multi Finance\",\r\n" + 
				"                \"tipeFasilitas\": \"OtherWithLoanAgreement\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"09/01/2019\",\r\n" + 
				"                \"akhirKontrak\": \"13/12/2019\",\r\n" + 
				"                \"pengkinianTerakhir\": \"31/12/2019\",\r\n" + 
				"                \"sisaTenor\": \"1\",\r\n" + 
				"                \"fasilitasAwal\": \"0\",\r\n" + 
				"                \"phOutstanding\": \"521000\",\r\n" + 
				"                \"angsuran\": \"528380\",\r\n" + 
				"                \"nominalTunggakan\": \"521000\",\r\n" + 
				"                \"ovdAngsuranTerakhir\": \"18\",\r\n" + 
				"                \"ovdMax1thTerakhir\": \"18\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"18\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiKredit\": \"PT. Adira Dinamika Multi Finance\",\r\n" + 
				"                \"tipeFasilitas\": \"OtherWithLoanAgreement\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"24/05/2019\",\r\n" + 
				"                \"akhirKontrak\": \"13/05/2020\",\r\n" + 
				"                \"pengkinianTerakhir\": \"31/12/2019\",\r\n" + 
				"                \"sisaTenor\": \"5\",\r\n" + 
				"                \"fasilitasAwal\": \"0\",\r\n" + 
				"                \"phOutstanding\": \"2201461\",\r\n" + 
				"                \"angsuran\": \"459180\",\r\n" + 
				"                \"nominalTunggakan\": \"918000\",\r\n" + 
				"                \"ovdAngsuranTerakhir\": \"79\",\r\n" + 
				"                \"ovdMax1thTerakhir\": \"79\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"79\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"detailKontrakLunas\": [\r\n" + 
				"            {\r\n" + 
				"                \"pemberiPinjaman\": \"PT. BANK DANAMON INDONESIA, TBK\",\r\n" + 
				"                \"tipeFasilitas\": \"CoFinancing\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"07/07/2015\",\r\n" + 
				"                \"akhirKontrak\": \"07/07/2016\",\r\n" + 
				"                \"totalFasilitas\": \"9441630\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"0\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiPinjaman\": \"PT. Adira Dinamika Multi Finance\",\r\n" + 
				"                \"tipeFasilitas\": \"CoFinancing\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"04/06/2016\",\r\n" + 
				"                \"akhirKontrak\": \"04/06/2017\",\r\n" + 
				"                \"totalFasilitas\": \"0\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": null\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiPinjaman\": \"PT. BANK TABUNGAN PENSIUNAN NASIONAL TBK\",\r\n" + 
				"                \"tipeFasilitas\": \"CoFinancing\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"03/10/2018\",\r\n" + 
				"                \"akhirKontrak\": \"03/10/2019\",\r\n" + 
				"                \"totalFasilitas\": \"1168200\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"0\"\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"pemberiPinjaman\": \"PT. HOME CREDIT INDONESIA\",\r\n" + 
				"                \"tipeFasilitas\": \"CoFinancing\",\r\n" + 
				"                \"tujuanPendanaan\": \"OtherConsumerCredit\",\r\n" + 
				"                \"akadAwal\": \"03/10/2018\",\r\n" + 
				"                \"akhirKontrak\": \"03/10/2019\",\r\n" + 
				"                \"totalFasilitas\": \"1298000\",\r\n" + 
				"                \"ovdMaxSelamaTenor\": \"0\"\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"detailCreditInfoPredictor\": {\r\n" + 
				"            \"trendProbabilityOfDefault\": [\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Feb-19\",\r\n" + 
				"                    \"probOfDefault\": \"8.84\",\r\n" + 
				"                    \"cipScore\": \"631\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Mar-19\",\r\n" + 
				"                    \"probOfDefault\": \"8.84\",\r\n" + 
				"                    \"cipScore\": \"631\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Apr-19\",\r\n" + 
				"                    \"probOfDefault\": \"7.78\",\r\n" + 
				"                    \"cipScore\": \"637\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"May-19\",\r\n" + 
				"                    \"probOfDefault\": \"4.33\",\r\n" + 
				"                    \"cipScore\": \"664\",\r\n" + 
				"                    \"kategoriResiko\": \"Average Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Jun-19\",\r\n" + 
				"                    \"probOfDefault\": \"8.12\",\r\n" + 
				"                    \"cipScore\": \"635\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Jul-19\",\r\n" + 
				"                    \"probOfDefault\": \"18.91\",\r\n" + 
				"                    \"cipScore\": \"593\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Aug-19\",\r\n" + 
				"                    \"probOfDefault\": \"25.68\",\r\n" + 
				"                    \"cipScore\": \"576\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Sep-19\",\r\n" + 
				"                    \"probOfDefault\": \"25.68\",\r\n" + 
				"                    \"cipScore\": \"576\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Oct-19\",\r\n" + 
				"                    \"probOfDefault\": \"25.68\",\r\n" + 
				"                    \"cipScore\": \"576\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Nov-19\",\r\n" + 
				"                    \"probOfDefault\": \"19.27\",\r\n" + 
				"                    \"cipScore\": \"592\",\r\n" + 
				"                    \"kategoriResiko\": \"High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Dec-19\",\r\n" + 
				"                    \"probOfDefault\": \"31.81\",\r\n" + 
				"                    \"cipScore\": \"563\",\r\n" + 
				"                    \"kategoriResiko\": \"Very High Risk\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"tahunBulan\": \"Jan-20\",\r\n" + 
				"                    \"probOfDefault\": \"29.36\",\r\n" + 
				"                    \"cipScore\": \"568\",\r\n" + 
				"                    \"kategoriResiko\": \"Very High Risk\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"reason\": [\r\n" + 
				"                {\r\n" + 
				"                    \"code\": \"HMP2\",\r\n" + 
				"                    \"desc\": \"The last available snapshot shows bad payment behaviour\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"code\": \"MSM1\",\r\n" + 
				"                    \"desc\": \"Several instalments were delinquent during last 3 months\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"code\": \"MTP1\",\r\n" + 
				"                    \"desc\": \"No months with timely payments after delinquency on at least one open contract\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"code\": \"AMO2\",\r\n" + 
				"                    \"desc\": \"High overdue amount during last 3 months\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"code\": \"NBC3\",\r\n" + 
				"                    \"desc\": \"3 credit obligations were active recently\"\r\n" + 
				"                }\r\n" + 
				"            ],\r\n" + 
				"            \"pefindoScore\": \"E1\",\r\n" + 
				"            \"kategoriResiko\": \"Very High Risk\"\r\n" + 
				"        },\r\n" + 
				"        \"summaryTrendKolektibilitas\": {\r\n" + 
				"            \"kolektibilitas\": \"2\",\r\n" + 
				"            \"summaryKolektibilitas\": [\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Feb-19\",\r\n" + 
				"                    \"overdue\": \"0\",\r\n" + 
				"                    \"kolektibilitas\": \"1\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Mar-19\",\r\n" + 
				"                    \"overdue\": \"0\",\r\n" + 
				"                    \"kolektibilitas\": \"1\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Apr-19\",\r\n" + 
				"                    \"overdue\": \"0\",\r\n" + 
				"                    \"kolektibilitas\": \"1\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"May-19\",\r\n" + 
				"                    \"overdue\": \"0\",\r\n" + 
				"                    \"kolektibilitas\": \"1\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Jun-19\",\r\n" + 
				"                    \"overdue\": \"17\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Jul-19\",\r\n" + 
				"                    \"overdue\": \"18\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Aug-19\",\r\n" + 
				"                    \"overdue\": \"18\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Sep-19\",\r\n" + 
				"                    \"overdue\": \"17\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Oct-19\",\r\n" + 
				"                    \"overdue\": \"18\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Nov-19\",\r\n" + 
				"                    \"overdue\": \"48\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Dec-19\",\r\n" + 
				"                    \"overdue\": \"79\",\r\n" + 
				"                    \"kolektibilitas\": \"2\"\r\n" + 
				"                },\r\n" + 
				"                {\r\n" + 
				"                    \"date\": \"Jan-20\",\r\n" + 
				"                    \"overdue\": \"NO DATA\",\r\n" + 
				"                    \"kolektibilitas\": \"NO DATA\"\r\n" + 
				"                }\r\n" + 
				"            ]\r\n" + 
				"        }\r\n" + 
				"    }\r\n" + 
				"}";
	
	return ResponseEntity.ok().headers(responseHeaders).body(str);
	}
	
}
