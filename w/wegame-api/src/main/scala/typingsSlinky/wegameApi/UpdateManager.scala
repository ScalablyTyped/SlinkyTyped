package typingsSlinky.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateManager extends js.Object {
  /**
    * 应用更新包并重启
    */
  def applyUpdate(): Unit = js.native
  /**
    * 监听检查更新结果回调
    */
  def onCheckForUpdate(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载失败回调
    */
  def onUpdateFailed(callback: js.Function0[Unit]): Unit = js.native
  /**
    * 监听更新包下载成功回调
    */
  def onUpdateReady(callback: js.Function0[Unit]): Unit = js.native
}

object UpdateManager {
  @scala.inline
  def apply(
    applyUpdate: () => Unit,
    onCheckForUpdate: js.Function0[Unit] => Unit,
    onUpdateFailed: js.Function0[Unit] => Unit,
    onUpdateReady: js.Function0[Unit] => Unit
  ): UpdateManager = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction0(applyUpdate), onCheckForUpdate = js.Any.fromFunction1(onCheckForUpdate), onUpdateFailed = js.Any.fromFunction1(onUpdateFailed), onUpdateReady = js.Any.fromFunction1(onUpdateReady))
    __obj.asInstanceOf[UpdateManager]
  }
  @scala.inline
  implicit class UpdateManagerOps[Self <: UpdateManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnCheckForUpdate(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCheckForUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUpdateFailed(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateFailed")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnUpdateReady(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdateReady")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

