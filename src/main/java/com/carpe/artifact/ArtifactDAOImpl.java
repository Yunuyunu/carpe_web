package com.carpe.artifact;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ArtifactDAOImpl implements ArtifactDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String Namespace = "com.carpe.mapper.artifact";

	// Plaso Result
	@Override
	public List<Map> selectSystemLogOverviewList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectSystemLogOverviewList", paramMap);
	}

	@Override
	public Map selectSystemLogOverviewListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectSystemLogOverviewListCount", paramMap);
	}

	// Operating System
	@Override
	public List<Map> selectOSInstallationList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectOSInstallationList", paramMap);
	}

	@Override
	public Map selectOSInstallationListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectOSInstallationListCount", paramMap);
	}

	// Windows Storage Device
	@Override
	public List<Map> selectStorageDeviceList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectStorageDeviceList", paramMap);
	}

	@Override
	public Map selectStorageDeviceListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectStorageDeviceListCount", paramMap);
	}

	// Installed Application
	@Override
	public List<Map> selectInstalledAppList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectInstalledAppList", paramMap);
	}

	@Override
	public Map selectInstalledAppListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectInstalledAppListCount", paramMap);
	}

	// Web History
	@Override
	public List<Map> selectWebHistoryList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectWebHistoryList", paramMap);
	}

	@Override
	public Map selectWebHistoryListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectWebHistoryListCount", paramMap);
	}

	// Web Download
	@Override
	public List<Map> selectWebDownloadList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectWebDownloadList", paramMap);
	}

	@Override
	public Map selectWebDownloadListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectWebDownloadListCount", paramMap);
	}

	// Web Cache
	@Override
	public List<Map> selectWebCacheList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectWebCacheList", paramMap);
	}

	@Override
	public Map selectWebCacheListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectWebCacheListCount", paramMap);
	}

	// Web Cookie
	@Override
	public List<Map> selectWebCookieList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectWebCookieList", paramMap);
	}

	@Override
	public Map selectWebCookieListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectWebCookieListCount", paramMap);
	}
	
	@Override
	public List<Map> selectTimelineList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectTimelineList", paramMap);
	}
	
	// ####################### lv1 #############################
	// lv1_os_win_event_logs
	@Override
	public List<Map> selectEventLogsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsList", paramMap);
	}

	@Override
	public Map selectEventLogsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsListCount", paramMap);
	}

	// lv1_os_win_event_logs_antiforensics
	@Override
	public List<Map> selectEventLogsAntiforensicsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsAntiforensicsList", paramMap);
	}

	@Override
	public Map selectEventLogsAntiforensicsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsAntiforensicsListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_applications
	@Override
	public List<Map> selectEventLogsApplicationsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsApplicationsList", paramMap);
	}

	@Override
	public Map selectEventLogsApplicationsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsApplicationsListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_dns
	@Override
	public List<Map> selectEventLogsDNSList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsDNSList", paramMap);
	}

	@Override
	public Map selectEventLogsDNSListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsDNSListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_file_handling
	@Override
	public List<Map> selectEventLogsFileHandlingList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsFileHandlingList", paramMap);
	}

	@Override
	public Map selectEventLogsFileHandlingListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsFileHandlingListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_logonoff
	@Override
	public List<Map> selectEventLogsLogonoffList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsLogonoffList", paramMap);
	}

	@Override
	public Map selectEventLogsLogonoffListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsLogonoffListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_ms_alerts
	@Override
	public List<Map> selectEventLogsMsAlertsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsMsAlertsList", paramMap);
	}

	@Override
	public Map selectEventLogsMsAlertsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsMsAlertsListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_msi_installer
	@Override
	public List<Map> selectEventLogsMsiInstallerList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsMsiInstallerList", paramMap);
	}

	@Override
	public Map selectEventLogsMsiInstallerListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsMsiInstallerListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_network
	@Override
	public List<Map> selectEventLogsNetworkList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsNetworkList", paramMap);
	}

	@Override
	public Map selectEventLogsNetworkListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsNetworkListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_others
	@Override
	public List<Map> selectEventLogsOthersList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsOthersList", paramMap);
	}

	@Override
	public Map selectEventLogsOthersListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsOthersListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_pconoff
	@Override
	public List<Map> selectEventLogsPConoffList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsPConoffList", paramMap);
	}

	@Override
	public Map selectEventLogsPConoffListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsPConoffListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_printer
	@Override
	public List<Map> selectEventLogsPrinterList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsPrinterList", paramMap);
	}

	@Override
	public Map selectEventLogsPrinterListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsPrinterListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_process
	@Override
	public List<Map> selectEventLogsProcessList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsProcessList", paramMap);
	}

	@Override
	public Map selectEventLogsProcessListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsProcessListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_registry_handling
	@Override
	public List<Map> selectEventLogsRegistryHandlingList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsRegistryHandlingList", paramMap);
	}

	@Override
	public Map selectEventLogsRegistryHandlingListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsRegistryHandlingListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_remoteonoff
	@Override
	public List<Map> selectEventLogsRemoteonoffList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsRemoteonoffList", paramMap);
	}

	@Override
	public Map selectEventLogsRemoteonoffListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsRemoteonoffListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_screen_saver
	@Override
	public List<Map> selectEventLogsScreenSaverList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsScreenSaverList", paramMap);
	}

	@Override
	public Map selectEventLogsScreenSaverListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsScreenSaverListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_shared_folder
	@Override
	public List<Map> selectEventLogsSharedFolderList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsSharedFolderList", paramMap);
	}

	@Override
	public Map selectEventLogsSharedFolderListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsSharedFolderListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_sleeponoff
	@Override
	public List<Map> selectEventLogsSleeponoffList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsSleeponoffList", paramMap);
	}

	@Override
	public Map selectEventLogsSleeponoffListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsSleeponoffListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_telemetry
	@Override
	public List<Map> selectEventLogsTelemetryList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsTelemetryList", paramMap);
	}

	@Override
	public Map selectEventLogsTelemetryListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsTelemetryListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_time_changed
	@Override
	public List<Map> selectEventLogsTimeChangedList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsTimeChangedList", paramMap);
	}

	@Override
	public Map selectEventLogsTimeChangedListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsTimeChangedListCount", paramMap);
	}
	
	// lv1_os_win_event_logs_usb_devices
	@Override
	public List<Map> selectEventLogsUsbDevicesList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectEventLogsUsbDevicesList", paramMap);
	}

	@Override
	public Map selectEventLogsUsbDevicesListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectEventLogsUsbDevicesListCount", paramMap);
	}
	
	
	
	// lv1_os_win_jumplist
	@Override
	public List<Map> selectJumplistList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectJumplistList", paramMap);
	}

	@Override
	public Map selectJumplistListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectJumplistListCount", paramMap);
	}
	
	// lv1_os_win_reg_amcache_file_entries
	@Override
	public List<Map> selectRegAmcacheFileEntriesList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegAmcacheFileEntriesList", paramMap);
	}

	@Override
	public Map selectRegAmcacheFileEntriesListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegAmcacheFileEntriesListCount", paramMap);
	}

	// lv1_os_win_reg_amcache_program_entries
	@Override
	public List<Map> selectRegAmcacheProgramEntriesList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegAmcacheProgramEntriesList", paramMap);
	}

	@Override
	public Map selectRegAmcacheProgramEntriesListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegAmcacheProgramEntriesListCount", paramMap);
	}
	
	// lv1_os_win_reg_installed_programs
	@Override
	public List<Map> selectRegInstalledProgramsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegInstalledProgramsList", paramMap);
	}

	@Override
	public Map selectRegInstalledProgramsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegInstalledProgramsListCount", paramMap);
	}
	
	// lv1_os_win_reg_os_info
	@Override
	public List<Map> selectRegOSInfoList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegOSInfoList", paramMap);
	}

	@Override
	public Map selectRegOSInfoListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegOSInfoListCount", paramMap);
	}
	
	// lv1_os_win_reg_usb_devices
	@Override
	public List<Map> selectRegUSBDevicesList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegUSBDevicesList", paramMap);
	}

	@Override
	public Map selectRegUSBDevicesListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegUSBDevicesListCount", paramMap);
	}
	
	// lv1_os_win_reg_user_accounts
	@Override
	public List<Map> selectRegUserAccountsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegUserAccountsList", paramMap);
	}

	@Override
	public Map selectRegUserAccountsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegUserAccountsListCount", paramMap);
	}
	
	// lv1_os_win_reg_file_connection
	@Override
	public List<Map> selectRegFileConnection(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegFileConnection", paramMap);
	}

	@Override
	public Map selectRegFileConnectionCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegFileConnectionCount", paramMap);
	}
	
	// lv1_os_win_reg_known_dll
	@Override
	public List<Map> selectRegKnownDll(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegKnownDll", paramMap);
	}

	@Override
	public Map selectRegKnownDllCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegKnownDllCount", paramMap);
	}
	
	// lv1_os_win_reg_mac_address
	@Override
	public List<Map> selectRegMacAddress(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegMacAddress", paramMap);
	}

	@Override
	public Map selectRegMacAddressCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegMacAddressCount", paramMap);
	}
	
	// lv1_os_win_reg_mru_folder
	@Override
	public List<Map> selectRegMruFolder(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegMruFolder", paramMap);
	}

	@Override
	public Map selectRegMruFolderCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegMruFolderCount", paramMap);
	}
	
	// lv1_os_win_reg_mui_cache
	@Override
	public List<Map> selectRegMuiCache(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegMuiCache", paramMap);
	}

	@Override
	public Map selectRegMuiCacheCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegMuiCacheCount", paramMap);
	}
	
	// lv1_os_win_reg_network_drive
	@Override
	public List<Map> selectRegNetworkDrive(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegNetworkDrive", paramMap);
	}

	@Override
	public Map selectRegNetworkDriveCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegNetworkDriveCount", paramMap);
	}
	
	// lv1_os_win_reg_network_interface
	@Override
	public List<Map> selectRegNetworkInterface(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegNetworkInterface", paramMap);
	}

	@Override
	public Map selectRegNetworkInterfaceCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegNetworkInterfaceCount", paramMap);
	}
	
	// lv1_os_win_reg_network_profile
	@Override
	public List<Map> selectRegNetworkProfile(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegNetworkProfile", paramMap);
	}

	@Override
	public Map selectRegNetworkProfileCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegNetworkProfileCount", paramMap);
	}
	
	// lv1_os_win_reg_recent_docs
	@Override
	public List<Map> selectRegRecentDocs(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegRecentDocs", paramMap);
	}

	@Override
	public Map selectRegRecentDocsCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegRecentDocsCount", paramMap);
	}
	
	// lv1_os_win_reg_run_command
	@Override
	public List<Map> selectRegRunCommand(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegRunCommand", paramMap);
	}

	@Override
	public Map selectRegRunCommandCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegRunCommandCount", paramMap);
	}
	
	// lv1_os_win_reg_search_keyword
	@Override
	public List<Map> selectRegSearchKeyword(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegSearchKeyword", paramMap);
	}

	@Override
	public Map selectRegSearchKeywordCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegSearchKeywordCount", paramMap);
	}
	
	// lv1_os_win_reg_shellbag
	@Override
	public List<Map> selectShellbag(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectShellbag", paramMap);
		}

	@Override
	public Map selectShellbagCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectShellbagCount", paramMap);
		}


	// lv1_os_win_reg_shim_cache
	@Override
	public List<Map> selectRegShimCache(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegShimCache", paramMap);
	}

	@Override
	public Map selectRegShimCacheCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegShimCacheCount", paramMap);
	}
	
	// lv1_os_win_reg_start_list
	@Override
	public List<Map> selectRegStartList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegStartList", paramMap);
	}

	@Override
	public Map selectRegStartListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegStartListCount", paramMap);
	}
	
	// lv1_os_win_reg_system_service
	@Override
	public List<Map> selectRegSystemService(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegSystemService", paramMap);
	}

	@Override
	public Map selectRegSystemServiceCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegSystemServiceCount", paramMap);
	}
	
	// lv1_app_web_chrome_visit_urls
	@Override
	public List<Map> selectChromeVisitUrlsList(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectChromeVisitUrlsList", paramMap);
	}

	@Override
	public Map selectChromeVisitUrlsListCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectChromeVisitUrlsListCount", paramMap);
	}
	
	// lv1_os_win_reg_userassist
	@Override
	public List<Map> selectRegUserAssist(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectRegUserAssist", paramMap);
	}

	@Override
	public Map selectRegUserAssistCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectRegUserAssistCount", paramMap);
	}
	
	// lv1_os_win_lnk_files
	@Override
	public List<Map> selectLnkFiles(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectLnkFiles", paramMap);
	}

	@Override
	public Map selectLnkFilesCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectLnkFilesCount", paramMap);
	}
	/*
	// lv1_os_win_prefetch
	@Override
	public List<Map> selectPrefetch(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectPrefetch", paramMap);
	}

	@Override
	public Map selectPrefetchCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectPrefetchCount", paramMap);
	}
	*/
	/*
	// lv1_app_web_chrome_download
	@Override
	public List<Map> selectChromeDownload(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectChromeDownload", paramMap);
	}

	@Override
	public Map selectChromeDownloadCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectChromeDownloadCount", paramMap);
	}
	
	// lv1_app_web_chrome_cookies
	@Override
	public List<Map> selectChromeCookie(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectChromeCookie", paramMap);
	}

	@Override
	public Map selectChromeCookieCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectChromeCookieCount", paramMap);
	}
	
	// lv1_app_web_chrome_cache
	@Override
	public List<Map> selectChromeCache(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectChromeCache", paramMap);
	}

	@Override
	public Map selectChromeCacheCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectChromeCacheCount", paramMap);
	}

	// lv1_app_web_chrome_search_terms
	@Override
	public List<Map> selectChromeSearchTerms(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectChromeSearchTerms", paramMap);
	}

	@Override
	public Map selectChromeSearchTermsCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectChromeSearchTermsCount", paramMap);
	}
*/
	// lv1_app_web_chrome_autofill
	@Override
	public List<Map> selectChromeAutofill(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeAutofill", paramMap);
		}

	@Override
	public Map selectChromeAutofillCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeAutofillCount", paramMap);
		}

	// lv1_app_web_chrome_bookmarks
	@Override
	public List<Map> selectChromeBookmarks(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeBookmarks", paramMap);
		}

	@Override
	public Map selectChromeBookmarksCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeBookmarksCount", paramMap);
		}

	// lv1_app_web_chrome_cookies
	@Override
	public List<Map> selectChromeCookies(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeCookies", paramMap);
		}

	@Override
	public Map selectChromeCookiesCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeCookiesCount", paramMap);
		}

	// lv1_app_web_chrome_download
	@Override
	public List<Map> selectChromeDownload(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeDownload", paramMap);
		}

	@Override
	public Map selectChromeDownloadCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeDownloadCount", paramMap);
		}

	// lv1_app_web_chrome_favicons
	@Override
	public List<Map> selectChromeFavicons(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeFavicons", paramMap);
		}

	@Override
	public Map selectChromeFaviconsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeFaviconsCount", paramMap);
		}

	// lv1_app_web_chrome_logindata
	@Override
	public List<Map> selectChromeLoginData(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeLoginData", paramMap);
		}

	@Override
	public Map selectChromeLoginDataCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeLoginDataCount", paramMap);
		}

	// lv1_app_web_chrome_search_terms
	@Override
	public List<Map> selectChromeSearchTerms(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeSearchTerms", paramMap);
		}

	@Override
	public Map selectChromeSearchTermsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeSearchTermsCount", paramMap);
		}

	// lv1_app_web_chrome_shortcuts
	@Override
	public List<Map> selectChromeShortcuts(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeShortcuts", paramMap);
		}

	@Override
	public Map selectChromeShortcutsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeShortcutsCount", paramMap);
		}

	// lv1_app_web_chrome_top_sites
	@Override
	public List<Map> selectChromeTopSites(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeTopSites", paramMap);
		}

	@Override
	public Map selectChromeTopSitesCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeTopSitesCount", paramMap);
		}

	// lv1_app_web_chrome_visit_urls
	@Override
	public List<Map> selectChromeVisitUrls(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectChromeVisitUrls", paramMap);
		}

	@Override
	public Map selectChromeVisitUrlsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectChromeVisitUrlsCount", paramMap);
		}

	/*
	// lv1_fs_ntfs_logfile
	@Override
	public List<Map> selectNtfsLogfile(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectNtfsLogfile", paramMap);
	}

	@Override
	public Map selectNtfsLogfileCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectNtfsLogfileCount", paramMap);
	}
	
	// lv1_fs_ntfs_usnjrnl
	@Override
	public List<Map> selectNtfsUsnjrnl(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectNtfsUsnjrnl", paramMap);
	}

	@Override
	public Map selectNtfsUsnjrnlCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectNtfsUsnjrnlCount", paramMap);
	}
	*/
	// lv2_os_app_history
	@Override
	public List<Map> selectAppHistory(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectList(Namespace + ".selectAppHistory", paramMap);
	}

	@Override
	public Map selectAppHistoryCount(Map<String, Object> paramMap) throws Exception {
		return sqlSession.selectOne(Namespace + ".selectAppHistoryCount", paramMap);
	}
	
	// lv1_os_win_notification
	@Override
	public List<Map> selectNotification(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectNotification", paramMap);
		}

	@Override
	public Map selectNotificationCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectNotificationCount", paramMap);
		}

	// lv1_os_win_prefetch
	@Override
	public List<Map> selectPrefetch(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectPrefetch", paramMap);
		}

	@Override
	public Map selectPrefetchCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectPrefetchCount", paramMap);
		}

	// lv1_os_win_prefetch_run_info
	@Override
	public List<Map> selectPrefetchRunInfo(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectPrefetchRunInfo", paramMap);
		}

	@Override
	public Map selectPrefetchRunInfoCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectPrefetchRunInfoCount", paramMap);
		}

	// lv1_os_win_prefetch_volume_info
	@Override
	public List<Map> selectPrefetchVolumeInfo(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectPrefetchVolumeInfo", paramMap);
		}

	@Override
	public Map selectPrefetchVolumeInfoCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectPrefetchVolumeInfoCount", paramMap);
		}

	// lv1_os_win_recyclebin
	@Override
	public List<Map> selectRecycleBin(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectRecycleBin", paramMap);
		}

	@Override
	public Map selectRecycleBinCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectRecycleBinCount", paramMap);
		}

	// lv1_os_win_sticky_note
	@Override
	public List<Map> selectStickyNote(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectStickyNote", paramMap);
		}

	@Override
	public Map selectStickyNoteCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectStickyNoteCount", paramMap);
		}

	// lv1_os_win_windows_timeline
	@Override
	public List<Map> selectWindowsTimeline(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectWindowsTimeline", paramMap);
		}

	@Override
	public Map selectWindowsTimelineCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectWindowsTimelineCount", paramMap);
		}
	
	// lv1_app_kakaotalk_new_chatLogs
	@Override
	public List<Map> selectKakaotalkNewChatlogs(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkNewChatlogs", paramMap);
	}

	@Override
	public Map selectKakaotalkNewChatlogsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkNewChatlogsCount", paramMap);
	}

	// lv1_app_kakaotalk_chatLogs
	@Override
	public List<Map> selectKakaotalkChatlogs(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkChatlogs", paramMap);
	}

	@Override
	public Map selectKakaotalkChatlogsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkChatlogsCount", paramMap);
	}

	// lv1_app_kakaotalk_chatLog_attachment
	@Override
	public List<Map> selectKakaotalkChatlogAttachment(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkChatlogAttachment", paramMap);
	}

	@Override
	public Map selectKakaotalkChatlogAttachmentCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkChatlogAttachmentCount", paramMap);
	}

	// lv1_app_kakaotalk_chatLogDrafts
	@Override
	public List<Map> selectKakaotalkChatlogDrafts(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkChatlogDrafts", paramMap);
	}

	@Override
	public Map selectKakaotalkChatlogDraftsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkChatlogDraftsCount", paramMap);
	}

	// lv1_fs_ntfs_logfile_log_record
	@Override
	public List<Map> selectLogRecord(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectLogRecord", paramMap);
	}

	@Override
	public Map selectLogRecordCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectLogRecordCount", paramMap);
	}

	// lv1_fs_ntfs_logfile_restart_area
	@Override
	public List<Map> selectRestartArea(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectRestartArea", paramMap);
	}

	@Override
	public Map selectRestartAreaCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectRestartAreaCount", paramMap);
	}

	// lv1_fs_ntfs_mft
	@Override
	public List<Map> selectMFT(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectMFT", paramMap);
	}

	@Override
	public Map selectMFTCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectMFTCount", paramMap);
	}

	// lv1_fs_ntfs_usnjrnl
	@Override
	public List<Map> selectUsnJrnl(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectUsnJrnl", paramMap);
	}

	@Override
	public Map selectUsnJrnlCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectUsnJrnlCount", paramMap);
	}

	// lv1_app_kakaotalk_mobile_chatlogs
	@Override
	public List<Map> selectKakaotalkMobileChatlogs(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkMobileChatlogs", paramMap);
	}

	@Override
	public Map selectKakaotalkMobileChatlogsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkMobileChatlogsCount", paramMap);
	}

	// lv1_app_kakaotalk_mobile_chatrooms
	@Override
	public List<Map> selectKakaotalkMobileChatrooms(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkMobileChatrooms", paramMap);
	}

	@Override
	public Map selectKakaotalkMobileChatroomsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkMobileChatroomsCount", paramMap);
	}

	// lv1_app_kakaotalk_mobile_friends
	@Override
	public List<Map> selectKakaotalkMobileFriends(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectKakaotalkMobileFriends", paramMap);
	}

	@Override
	public Map selectKakaotalkMobileFriendsCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectKakaotalkMobileFriendsCount", paramMap);
	}

	// lv1_os_and_app_list
	@Override
	public List<Map> selectAppList(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectAppList", paramMap);
	}

	@Override
	public Map selectAppListCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectAppListCount", paramMap);
	}

	// lv1_os_and_call_history
	@Override
	public List<Map> selectCallHistory(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectCallHistory", paramMap);
	}

	@Override
	public Map selectCallHistoryCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectCallHistoryCount", paramMap);
	}

	// lv1_os_and_emb_file
	@Override
	public List<Map> selectEmbFile(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectEmbFile", paramMap);
	}

	@Override
	public Map selectEmbFileCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectEmbFileCount", paramMap);
	}

	// lv1_os_and_file_history
	@Override
	public List<Map> selectFileHistory(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectFileHistory", paramMap);
	}

	@Override
	public Map selectFileHistoryCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectFileHistoryCount", paramMap);
	}

	// lv1_os_and_geodata
	@Override
	public List<Map> selectGeodata(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectGeodata", paramMap);
	}

	@Override
	public Map selectGeodataCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectGeodataCount", paramMap);
	}

	// lv1_os_and_id_pw_hash
	@Override
	public List<Map> selectIdpwhash(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectId&pwhash", paramMap);
	}

	@Override
	public Map selectIdpwhashCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectId&pwhashCount", paramMap);
	}

	// lv1_os_and_web_browser_history
	@Override
	public List<Map> selectWebBrowserHistory(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectList(Namespace + ".selectWebBrowserHistory", paramMap);
	}

	@Override
	public Map selectWebBrowserHistoryCount(Map<String, Object> paramMap) throws Exception {
	    return sqlSession.selectOne(Namespace + ".selectWebBrowserHistoryCount", paramMap);
	}


}