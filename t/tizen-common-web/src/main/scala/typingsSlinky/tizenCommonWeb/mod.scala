package typingsSlinky.tizenCommonWeb

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlConstructor
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlDataConstructor
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode
import typingsSlinky.tizenCommonWeb.applicationMod.ApplicationManager
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadHTTPHeaderFields
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadManager
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadNetworkType
import typingsSlinky.tizenCommonWeb.downloadMod.DownloadRequestConstructor
import typingsSlinky.tizenCommonWeb.filesystemMod.FilesystemManager
import typingsSlinky.tizenCommonWeb.packageMod.PackageManager
import typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoManager
import typingsSlinky.tizenCommonWeb.timeMod.TZDateConstructor
import typingsSlinky.tizenCommonWeb.timeMod.TimeDurationConstructor
import typingsSlinky.tizenCommonWeb.timeMod.TimeDurationUnit
import typingsSlinky.tizenCommonWeb.timeMod.TimeUtil
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.ALL
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.ASC
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.CELLULAR
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.CONTAINS
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.DESC
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.ENDSWITH
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.EXACTLY
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.EXISTS
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.FULLSTRING
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.GROUP
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.INTERSECTION
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.SINGLE
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.STARTSWITH
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.UNION
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.WIFI
import typingsSlinky.tizenCommonWeb.tizenMod.AbstractFilter
import typingsSlinky.tizenCommonWeb.tizenMod.AttributeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.AttributeRangeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.BundleConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilterConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilterType
import typingsSlinky.tizenCommonWeb.tizenMod.FilterMatchFlag
import typingsSlinky.tizenCommonWeb.tizenMod.SimpleCoordinatesConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.SortModeConstructor
import typingsSlinky.tizenCommonWeb.tizenMod.SortModeOrder
import typingsSlinky.tizenCommonWeb.tizenMod.WebAPIException
import typingsSlinky.tizenCommonWeb.tvaudiocontrolMod.TVAudioControlManager
import typingsSlinky.tizenCommonWeb.tvdisplaycontrolMod.TVDisplayControlManager
import typingsSlinky.tizenCommonWeb.tvinfoMod.TVInfoManager
import typingsSlinky.tizenCommonWeb.tvinputdeviceMod.TVInputDeviceManager
import typingsSlinky.tizenCommonWeb.tvwindowMod.TVWindowManager
import typingsSlinky.tizenCommonWeb.websettingMod.WebSettingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tizen-common-web", JSImport.Namespace)
  @js.native
  val ^ : Tizen = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "ApplicationControl")
  @js.native
  class ApplicationControl protected ()
    extends typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControl {
    def this(
      operation: String,
      uri: js.UndefOr[String],
      mime: js.UndefOr[String],
      category: js.UndefOr[String],
      data: js.UndefOr[js.Array[typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlData]],
      launchMode: js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "ApplicationControlData")
  @js.native
  class ApplicationControlData protected ()
    extends typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlData {
    def this(key: String, value: js.Array[String]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "AttributeFilter")
  @js.native
  class AttributeFilter protected ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.AttributeFilter {
    def this(attributeName: String) = this()
    def this(attributeName: String, matchFlag: CONTAINS) = this()
    def this(attributeName: String, matchFlag: ENDSWITH) = this()
    def this(attributeName: String, matchFlag: EXACTLY) = this()
    def this(attributeName: String, matchFlag: EXISTS) = this()
    def this(attributeName: String, matchFlag: FULLSTRING) = this()
    def this(attributeName: String, matchFlag: STARTSWITH) = this()
    def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
    def this(attributeName: String, matchFlag: js.UndefOr[scala.Nothing], matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: CONTAINS, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: ENDSWITH, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: EXACTLY, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: EXISTS, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: FULLSTRING, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: STARTSWITH, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "AttributeRangeFilter")
  @js.native
  class AttributeRangeFilter protected ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.AttributeRangeFilter {
    def this(attributeName: String) = this()
    def this(attributeName: String, initialValue: js.Any) = this()
    def this(attributeName: String, initialValue: js.UndefOr[scala.Nothing], endValue: js.Any) = this()
    def this(attributeName: String, initialValue: js.Any, endValue: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "Bundle")
  @js.native
  class Bundle ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.Bundle
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "CompositeFilter")
  @js.native
  class CompositeFilter protected ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilter {
    def this(`type`: INTERSECTION) = this()
    def this(`type`: UNION) = this()
    def this(`type`: CompositeFilterType) = this()
    def this(`type`: INTERSECTION, filters: js.Array[AbstractFilter]) = this()
    def this(`type`: UNION, filters: js.Array[AbstractFilter]) = this()
    def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "DownloadRequest")
  @js.native
  class DownloadRequest protected ()
    extends typingsSlinky.tizenCommonWeb.downloadMod.DownloadRequest {
    /**
      * @param url An attribute to store the URL of the object to download.
      * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
      * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
      * The default value is an empty string.
      * @param fileName? An attribute to store the file name for the specified URL.
      * If the file name is not given or is an empty string, the original file name from the URL is used.
      * The default value is an empty string.
      * @param networkType? An attribute to store the allowed network type.
      * If the network type is not given, all network types are allowed.
      * The default value is ***ALL***
      * @since 2.1
      * @param httpHeader? An attribute to store extra HTTP header fields.
      * @since 2.1
      * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
      * The default value is an empty object.
      */
    def this(url: String) = this()
    def this(url: String, destination: String) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String) = this()
    def this(url: String, destination: String, fileName: String) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: DownloadNetworkType
    ) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: ALL) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: WIFI) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType
    ) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: ALL) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: WIFI) = this()
    def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
    def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "SimpleCoordinates")
  @js.native
  class SimpleCoordinates protected ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.SimpleCoordinates {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "SortMode")
  @js.native
  class SortMode protected ()
    extends typingsSlinky.tizenCommonWeb.tizenMod.SortMode {
    def this(attributeName: String) = this()
    def this(attributeName: String, order: ASC) = this()
    def this(attributeName: String, order: DESC) = this()
    def this(attributeName: String, order: SortModeOrder) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "TZDate")
  @js.native
  /**
    * @param datetime Date and time passed as a javascript Date object. If this parameter is omitted, current date and time will be used.
    * @param timezone The time zone identifier, e.g. "Seoul/Korea" or "Europe/Berlin". If this parameter is omitted, the device's default time zone will be used.
    */
  class TZDate ()
    extends typingsSlinky.tizenCommonWeb.timeMod.TZDate {
    def this(datetime: js.Date) = this()
    def this(datetime: js.UndefOr[scala.Nothing], timezone: String) = this()
    def this(datetime: js.Date, timezone: String) = this()
    def this(year: Double, month: Double, day: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double, seconds: Double) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double,
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: js.UndefOr[scala.Nothing],
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "TimeDuration")
  @js.native
  class TimeDuration protected ()
    extends typingsSlinky.tizenCommonWeb.timeMod.TimeDuration {
    def this(length: Double, unit: TimeDurationUnit) = this()
  }
  
  object global {
    
    object tizen extends Shortcut {
      
      @JSGlobal("tizen")
      @js.native
      val ^ : Tizen = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.ApplicationControl")
      @js.native
      class ApplicationControl protected ()
        extends typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControl {
        def this(
          operation: String,
          uri: js.UndefOr[String],
          mime: js.UndefOr[String],
          category: js.UndefOr[String],
          data: js.UndefOr[js.Array[typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlData]],
          launchMode: js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP]
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.ApplicationControlData")
      @js.native
      class ApplicationControlData protected ()
        extends typingsSlinky.tizenCommonWeb.applicationMod.ApplicationControlData {
        def this(key: String, value: js.Array[String]) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.AttributeFilter")
      @js.native
      class AttributeFilter protected ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.AttributeFilter {
        def this(attributeName: String) = this()
        def this(attributeName: String, matchFlag: CONTAINS) = this()
        def this(attributeName: String, matchFlag: ENDSWITH) = this()
        def this(attributeName: String, matchFlag: EXACTLY) = this()
        def this(attributeName: String, matchFlag: EXISTS) = this()
        def this(attributeName: String, matchFlag: FULLSTRING) = this()
        def this(attributeName: String, matchFlag: STARTSWITH) = this()
        def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
        def this(attributeName: String, matchFlag: js.UndefOr[scala.Nothing], matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: CONTAINS, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: ENDSWITH, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: EXACTLY, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: EXISTS, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: FULLSTRING, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: STARTSWITH, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: js.Any) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.AttributeRangeFilter")
      @js.native
      class AttributeRangeFilter protected ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.AttributeRangeFilter {
        def this(attributeName: String) = this()
        def this(attributeName: String, initialValue: js.Any) = this()
        def this(attributeName: String, initialValue: js.UndefOr[scala.Nothing], endValue: js.Any) = this()
        def this(attributeName: String, initialValue: js.Any, endValue: js.Any) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.Bundle")
      @js.native
      class Bundle ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.Bundle
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.CompositeFilter")
      @js.native
      class CompositeFilter protected ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.CompositeFilter {
        def this(`type`: INTERSECTION) = this()
        def this(`type`: UNION) = this()
        def this(`type`: CompositeFilterType) = this()
        def this(`type`: INTERSECTION, filters: js.Array[AbstractFilter]) = this()
        def this(`type`: UNION, filters: js.Array[AbstractFilter]) = this()
        def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.DownloadRequest")
      @js.native
      class DownloadRequest protected ()
        extends typingsSlinky.tizenCommonWeb.downloadMod.DownloadRequest {
        /**
          * @param url An attribute to store the URL of the object to download.
          * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
          * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
          * The default value is an empty string.
          * @param fileName? An attribute to store the file name for the specified URL.
          * If the file name is not given or is an empty string, the original file name from the URL is used.
          * The default value is an empty string.
          * @param networkType? An attribute to store the allowed network type.
          * If the network type is not given, all network types are allowed.
          * The default value is ***ALL***
          * @since 2.1
          * @param httpHeader? An attribute to store extra HTTP header fields.
          * @since 2.1
          * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
          * The default value is an empty object.
          */
        def this(url: String) = this()
        def this(url: String, destination: String) = this()
        def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String) = this()
        def this(url: String, destination: String, fileName: String) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: DownloadNetworkType
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: ALL
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: CELLULAR
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: WIFI
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: DownloadNetworkType
        ) = this()
        def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: ALL) = this()
        def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: CELLULAR) = this()
        def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: WIFI) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: DownloadNetworkType
        ) = this()
        def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: ALL) = this()
        def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: CELLULAR) = this()
        def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: WIFI) = this()
        def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
        def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
        def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
        def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: js.UndefOr[scala.Nothing],
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: js.UndefOr[scala.Nothing],
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: js.UndefOr[scala.Nothing],
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: js.UndefOr[scala.Nothing],
          fileName: String,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: js.UndefOr[scala.Nothing],
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: js.UndefOr[scala.Nothing],
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: js.UndefOr[scala.Nothing],
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.SimpleCoordinates")
      @js.native
      class SimpleCoordinates protected ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.SimpleCoordinates {
        def this(latitude: Double, longitude: Double) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.SortMode")
      @js.native
      class SortMode protected ()
        extends typingsSlinky.tizenCommonWeb.tizenMod.SortMode {
        def this(attributeName: String) = this()
        def this(attributeName: String, order: ASC) = this()
        def this(attributeName: String, order: DESC) = this()
        def this(attributeName: String, order: SortModeOrder) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.TZDate")
      @js.native
      /**
        * @param datetime Date and time passed as a javascript Date object. If this parameter is omitted, current date and time will be used.
        * @param timezone The time zone identifier, e.g. "Seoul/Korea" or "Europe/Berlin". If this parameter is omitted, the device's default time zone will be used.
        */
      class TZDate ()
        extends typingsSlinky.tizenCommonWeb.timeMod.TZDate {
        def this(datetime: js.Date) = this()
        def this(datetime: js.UndefOr[scala.Nothing], timezone: String) = this()
        def this(datetime: js.Date, timezone: String) = this()
        def this(year: Double, month: Double, day: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double
        ) = this()
        def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double, seconds: Double) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: Double,
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: js.UndefOr[scala.Nothing],
          minutes: Double,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: js.UndefOr[scala.Nothing],
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: js.UndefOr[scala.Nothing],
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: js.UndefOr[scala.Nothing],
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.TimeDuration")
      @js.native
      class TimeDuration protected ()
        extends typingsSlinky.tizenCommonWeb.timeMod.TimeDuration {
        def this(length: Double, unit: TimeDurationUnit) = this()
      }
      
      type _To = Tizen
      
      /* This means you don't have to write `^`, but can instead just say `tizen.foo` */
      override def _to: Tizen = ^
    }
    
    @js.native
    trait Window extends StObject {
      
      var WebAPIError: WebAPIException = js.native
      
      var WebAPIException: typingsSlinky.tizenCommonWeb.tizenMod.WebAPIException = js.native
      
      var tizen: Tizen = js.native
    }
    object Window {
      
      @scala.inline
      def apply(WebAPIError: WebAPIException, WebAPIException: WebAPIException, tizen: Tizen): Window = {
        val __obj = js.Dynamic.literal(WebAPIError = WebAPIError.asInstanceOf[js.Any], WebAPIException = WebAPIException.asInstanceOf[js.Any], tizen = tizen.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTizen(value: Tizen): Self = StObject.set(x, "tizen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebAPIError(value: WebAPIException): Self = StObject.set(x, "WebAPIError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebAPIException(value: WebAPIException): Self = StObject.set(x, "WebAPIException", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait Tizen extends StObject {
    
    var ApplicationControl: ApplicationControlConstructor = js.native
    
    var ApplicationControlData: ApplicationControlDataConstructor = js.native
    
    var AttributeFilter: AttributeFilterConstructor = js.native
    
    var AttributeRangeFilter: AttributeRangeFilterConstructor = js.native
    
    var Bundle: BundleConstructor = js.native
    
    var CompositeFilter: CompositeFilterConstructor = js.native
    
    var DownloadRequest: DownloadRequestConstructor = js.native
    
    var SimpleCoordinates: SimpleCoordinatesConstructor = js.native
    
    var SortMode: SortModeConstructor = js.native
    
    var TZDate: TZDateConstructor = js.native
    
    var TimeDuration: TimeDurationConstructor = js.native
    
    @JSName("package")
    var _package: PackageManager = js.native
    
    var application: ApplicationManager = js.native
    
    var download: DownloadManager = js.native
    
    var filesystem: FilesystemManager = js.native
    
    var systeminfo: SystemInfoManager = js.native
    
    var time: TimeUtil = js.native
    
    var tvaudiocontrol: TVAudioControlManager = js.native
    
    var tvdisplaycontrol: TVDisplayControlManager = js.native
    
    var tvinfo: TVInfoManager = js.native
    
    var tvinputdevice: TVInputDeviceManager = js.native
    
    var tvwindow: TVWindowManager = js.native
    
    var websetting: WebSettingManager = js.native
  }
  object Tizen {
    
    @scala.inline
    def apply(
      ApplicationControl: ApplicationControlConstructor,
      ApplicationControlData: ApplicationControlDataConstructor,
      AttributeFilter: AttributeFilterConstructor,
      AttributeRangeFilter: AttributeRangeFilterConstructor,
      Bundle: BundleConstructor,
      CompositeFilter: CompositeFilterConstructor,
      DownloadRequest: DownloadRequestConstructor,
      SimpleCoordinates: SimpleCoordinatesConstructor,
      SortMode: SortModeConstructor,
      TZDate: TZDateConstructor,
      TimeDuration: TimeDurationConstructor,
      _package: PackageManager,
      application: ApplicationManager,
      download: DownloadManager,
      filesystem: FilesystemManager,
      systeminfo: SystemInfoManager,
      time: TimeUtil,
      tvaudiocontrol: TVAudioControlManager,
      tvdisplaycontrol: TVDisplayControlManager,
      tvinfo: TVInfoManager,
      tvinputdevice: TVInputDeviceManager,
      tvwindow: TVWindowManager,
      websetting: WebSettingManager
    ): Tizen = {
      val __obj = js.Dynamic.literal(ApplicationControl = ApplicationControl.asInstanceOf[js.Any], ApplicationControlData = ApplicationControlData.asInstanceOf[js.Any], AttributeFilter = AttributeFilter.asInstanceOf[js.Any], AttributeRangeFilter = AttributeRangeFilter.asInstanceOf[js.Any], Bundle = Bundle.asInstanceOf[js.Any], CompositeFilter = CompositeFilter.asInstanceOf[js.Any], DownloadRequest = DownloadRequest.asInstanceOf[js.Any], SimpleCoordinates = SimpleCoordinates.asInstanceOf[js.Any], SortMode = SortMode.asInstanceOf[js.Any], TZDate = TZDate.asInstanceOf[js.Any], TimeDuration = TimeDuration.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tvaudiocontrol = tvaudiocontrol.asInstanceOf[js.Any], tvdisplaycontrol = tvdisplaycontrol.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], tvinputdevice = tvinputdevice.asInstanceOf[js.Any], tvwindow = tvwindow.asInstanceOf[js.Any], websetting = websetting.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tizen]
    }
    
    @scala.inline
    implicit class TizenMutableBuilder[Self <: Tizen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: ApplicationManager): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationControl(value: ApplicationControlConstructor): Self = StObject.set(x, "ApplicationControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationControlData(value: ApplicationControlDataConstructor): Self = StObject.set(x, "ApplicationControlData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeFilter(value: AttributeFilterConstructor): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeRangeFilter(value: AttributeRangeFilterConstructor): Self = StObject.set(x, "AttributeRangeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundle(value: BundleConstructor): Self = StObject.set(x, "Bundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeFilter(value: CompositeFilterConstructor): Self = StObject.set(x, "CompositeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload(value: DownloadManager): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRequest(value: DownloadRequestConstructor): Self = StObject.set(x, "DownloadRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesystem(value: FilesystemManager): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleCoordinates(value: SimpleCoordinatesConstructor): Self = StObject.set(x, "SimpleCoordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortMode(value: SortModeConstructor): Self = StObject.set(x, "SortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSysteminfo(value: SystemInfoManager): Self = StObject.set(x, "systeminfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTZDate(value: TZDateConstructor): Self = StObject.set(x, "TZDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: TimeUtil): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDuration(value: TimeDurationConstructor): Self = StObject.set(x, "TimeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvaudiocontrol(value: TVAudioControlManager): Self = StObject.set(x, "tvaudiocontrol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvdisplaycontrol(value: TVDisplayControlManager): Self = StObject.set(x, "tvdisplaycontrol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvinfo(value: TVInfoManager): Self = StObject.set(x, "tvinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvinputdevice(value: TVInputDeviceManager): Self = StObject.set(x, "tvinputdevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvwindow(value: TVWindowManager): Self = StObject.set(x, "tvwindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsetting(value: WebSettingManager): Self = StObject.set(x, "websetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: PackageManager): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Tizen
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Tizen = ^
}
