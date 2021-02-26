package typingsSlinky.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region 接口
@js.native
trait Logger extends StObject {
  
  /**
    * 写debug日志，参数同log方法
    */
  def debug(args: js.Any*): Unit = js.native
  
  /**
    * 写info日志，参数同log方法
    */
  def info(args: js.Any*): Unit = js.native
  
  /**
    * 写log日志，可以提供任意个参数，每个参数的类型为Object/Array/Number/String，参数p1到pN的内容会写入日志
    */
  def log(args: js.Any*): Unit = js.native
  
  /**
    * 写warn日志，参数同log方法
    */
  def warn(args: js.Any*): Unit = js.native
}
object Logger {
  
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit,
    info: /* repeated */ js.Any => Unit,
    log: /* repeated */ js.Any => Unit,
    warn: /* repeated */ js.Any => Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
  }
}
