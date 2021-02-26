package typingsSlinky.wxServerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CrosFieldCommand = org.scalablytyped.runtime.StringDictionary[typingsSlinky.wxServerSdk.mod.Command | scala.Boolean]
  
  type DBRegExp = js.RegExp
  
  type PointCoordinates = js.Tuple2[scala.Double, scala.Double]
  
  type ServerDate = js.Date
  
  // 云函数
  @scala.inline
  def callFunction(options: typingsSlinky.wxServerSdk.anon.Data): js.Promise[typingsSlinky.wxServerSdk.mod.CallFunctionSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("callFunction")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.CallFunctionSuccess]]
  
  // 数据库 API
  @scala.inline
  def database(): typingsSlinky.wxServerSdk.mod.Database_ = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("database")().asInstanceOf[typingsSlinky.wxServerSdk.mod.Database_]
  @scala.inline
  def database(options: typingsSlinky.wxServerSdk.mod.DatabaseOptions): typingsSlinky.wxServerSdk.mod.Database_ = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("database")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.wxServerSdk.mod.Database_]
  
  @scala.inline
  def deleteFile(options: typingsSlinky.wxServerSdk.anon.FileList): js.Promise[typingsSlinky.wxServerSdk.mod.DeleteFileSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.DeleteFileSuccess]]
  
  @scala.inline
  def downloadFile(options: typingsSlinky.wxServerSdk.anon.FileID): js.Promise[typingsSlinky.wxServerSdk.mod.DownloadFileSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.DownloadFileSuccess]]
  
  @scala.inline
  def getTempFileURL(options: typingsSlinky.wxServerSdk.anon.FileList): js.Promise[typingsSlinky.wxServerSdk.mod.TetTempFileURLSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTempFileURL")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.TetTempFileURLSuccess]]
  
  // 云函数
  @scala.inline
  def getVoIPSign(options: typingsSlinky.wxServerSdk.mod.GetVoIPSignOptions): js.Promise[typingsSlinky.wxServerSdk.mod.GetVoIPSignSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getVoIPSign")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.GetVoIPSignSuccess]]
  
  @scala.inline
  def getWXContext(): typingsSlinky.wxServerSdk.anon.APPID = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getWXContext")().asInstanceOf[typingsSlinky.wxServerSdk.anon.APPID]
  
  @scala.inline
  def init(): scala.Unit = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[scala.Unit]
  @scala.inline
  def init(options: typingsSlinky.wxServerSdk.mod.InitOptions): scala.Unit = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def updateConfig(options: typingsSlinky.wxServerSdk.mod.InitOptions): scala.Unit = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateConfig")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  // 存储 API
  @scala.inline
  def uploadFile(options: typingsSlinky.wxServerSdk.anon.CloudPath): js.Promise[typingsSlinky.wxServerSdk.mod.UploadFileSuccess] = typingsSlinky.wxServerSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uploadFile")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.wxServerSdk.mod.UploadFileSuccess]]
}
