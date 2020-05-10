package typingsSlinky.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFileSystem extends js.Object {
  def join(paths: String*): String = js.native
  def mkdir(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def mkdirp(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
  def writeFile(path: String, data: js.Any, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
}

object OutputFileSystem {
  @scala.inline
  def apply(
    join: /* repeated */ String => String,
    mkdir: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit,
    mkdirp: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit,
    rmdir: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit,
    unlink: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit,
    writeFile: (String, js.Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
  ): OutputFileSystem = {
    val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), mkdir = js.Any.fromFunction2(mkdir), mkdirp = js.Any.fromFunction2(mkdirp), rmdir = js.Any.fromFunction2(rmdir), unlink = js.Any.fromFunction2(unlink), writeFile = js.Any.fromFunction3(writeFile))
    __obj.asInstanceOf[OutputFileSystem]
  }
  @scala.inline
  implicit class OutputFileSystemOps[Self <: OutputFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJoin(value: /* repeated */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMkdir(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMkdirp(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdirp")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRmdir(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnlink(value: (String, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withWriteFile(value: (String, js.Any, js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

