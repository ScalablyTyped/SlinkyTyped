package typingsSlinky.swaggerExpressMiddleware.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageEngine extends js.Object {
  def _handleFile(
    req: Request_[ParamsDictionary],
    file: File,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]
  ): Unit
  def _removeFile(req: Request_[ParamsDictionary], file: File, callback: js.Function1[/* error */ js.Error, Unit]): Unit
}

object StorageEngine {
  @scala.inline
  def apply(
    _handleFile: (Request_[ParamsDictionary], File, js.Function2[/* error */ js.UndefOr[js.Any], /* info */ js.UndefOr[File], Unit]) => Unit,
    _removeFile: (Request_[ParamsDictionary], File, js.Function1[/* error */ js.Error, Unit]) => Unit
  ): StorageEngine = {
    val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
  
    __obj.asInstanceOf[StorageEngine]
  }
}

