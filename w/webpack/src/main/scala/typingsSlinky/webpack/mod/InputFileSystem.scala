package typingsSlinky.webpack.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function0[Unit]] = js.native
  def readFile(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* contents */ Buffer, Unit]
  ): Unit = js.native
  def readFileSync(path: String): Buffer = js.native
  def readlink(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* linkString */ String, Unit]
  ): Unit = js.native
  def readlinkSync(path: String): String = js.native
  def stat(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stats */ js.Any, Unit]
  ): Unit = js.native
  def statSync(path: String): js.Any = js.native
}

object InputFileSystem {
  @scala.inline
  def apply(
    readFile: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* contents */ Buffer, Unit]) => Unit,
    readFileSync: String => Buffer,
    readlink: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* linkString */ String, Unit]) => Unit,
    readlinkSync: String => String,
    stat: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stats */ js.Any, Unit]) => Unit,
    statSync: String => js.Any
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal(readFile = js.Any.fromFunction2(readFile), readFileSync = js.Any.fromFunction1(readFileSync), readlink = js.Any.fromFunction2(readlink), readlinkSync = js.Any.fromFunction1(readlinkSync), stat = js.Any.fromFunction2(stat), statSync = js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[InputFileSystem]
  }
  @scala.inline
  implicit class InputFileSystemOps[Self <: InputFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReadFile(
      value: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* contents */ Buffer, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadFileSync(value: String => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReadlink(
      value: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* linkString */ String, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readlink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReadlinkSync(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readlinkSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStat(
      value: (String, js.Function2[/* err */ js.UndefOr[js.Error | Null], /* stats */ js.Any, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStatSync(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPurge(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPurge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purge")(js.undefined)
        ret
    }
  }
  
}

