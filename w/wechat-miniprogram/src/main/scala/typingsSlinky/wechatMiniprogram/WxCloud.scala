package typingsSlinky.wechatMiniprogram

import typingsSlinky.wechatMiniprogram.DB.Database
import typingsSlinky.wechatMiniprogram.ICloud.CallFunctionParam
import typingsSlinky.wechatMiniprogram.ICloud.CallFunctionResult
import typingsSlinky.wechatMiniprogram.ICloud.DeleteFileParam
import typingsSlinky.wechatMiniprogram.ICloud.DeleteFileResult
import typingsSlinky.wechatMiniprogram.ICloud.DownloadFileParam
import typingsSlinky.wechatMiniprogram.ICloud.DownloadFileResult
import typingsSlinky.wechatMiniprogram.ICloud.GetTempFileURLParam
import typingsSlinky.wechatMiniprogram.ICloud.GetTempFileURLResult
import typingsSlinky.wechatMiniprogram.ICloud.ICDNConstructor
import typingsSlinky.wechatMiniprogram.ICloud.ICDNFilePathSpec
import typingsSlinky.wechatMiniprogram.ICloud.ICloudIDConstructor
import typingsSlinky.wechatMiniprogram.ICloud.UploadFileParam
import typingsSlinky.wechatMiniprogram.ICloud.UploadFileResult
import typingsSlinky.wechatMiniprogram.WechatMiniprogram.DownloadTask
import typingsSlinky.wechatMiniprogram.WechatMiniprogram.UploadTask
import typingsSlinky.wechatMiniprogram.anon.RQCallFunctionParam
import typingsSlinky.wechatMiniprogram.anon.RQDeleteFileParam
import typingsSlinky.wechatMiniprogram.anon.RQDownloadFileParam
import typingsSlinky.wechatMiniprogram.anon.RQGetTempFileURLParam
import typingsSlinky.wechatMiniprogram.anon.RQUploadFileParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extend wx with cloud
  */
@js.native
trait WxCloud extends StObject {
  
  def CDN(options: String): typingsSlinky.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: js.typedarray.ArrayBuffer): typingsSlinky.wechatMiniprogram.ICloud.CDN = js.native
  def CDN(options: ICDNFilePathSpec): typingsSlinky.wechatMiniprogram.ICloud.CDN = js.native
  @JSName("CDN")
  var CDN_Original: ICDNConstructor = js.native
  
  def CloudID(cloudId: String): typingsSlinky.wechatMiniprogram.ICloud.CloudID = js.native
  @JSName("CloudID")
  var CloudID_Original: ICloudIDConstructor = js.native
  
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): js.Promise[CallFunctionResult] = js.native
  
  def database(): Database = js.native
  def database(config: ICloudConfig): Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): js.Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): DownloadTask = js.native
  def downloadFile(param: RQDownloadFileParam): js.Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): js.Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): UploadTask = js.native
  def uploadFile(param: RQUploadFileParam): js.Promise[UploadFileResult] = js.native
}
