package typingsSlinky.tesseractJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TesseractJob extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ js.Error, TesseractJob]] = js.native
  def `catch`(callback: js.Function1[/* error */ js.Error, Unit]): TesseractJob = js.native
  def `finally`(callback: js.Function1[/* resultOrError */ js.Error | Page, Unit]): TesseractJob = js.native
  def progress(callback: js.Function1[/* progress */ Progress, Unit]): TesseractJob = js.native
  def `then`(callback: js.Function1[/* result */ Page, Unit]): TesseractJob = js.native
}

object TesseractJob {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* error */ js.Error, Unit] => TesseractJob,
    `finally`: js.Function1[/* resultOrError */ js.Error | Page, Unit] => TesseractJob,
    progress: js.Function1[/* progress */ Progress, Unit] => TesseractJob,
    `then`: js.Function1[/* result */ Page, Unit] => TesseractJob
  ): TesseractJob = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[TesseractJob]
  }
  @scala.inline
  implicit class TesseractJobOps[Self <: TesseractJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatch(value: js.Function1[/* error */ js.Error, Unit] => TesseractJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFinally(value: js.Function1[/* resultOrError */ js.Error | Page, Unit] => TesseractJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finally")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProgress(value: js.Function1[/* progress */ Progress, Unit] => TesseractJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThen(value: js.Function1[/* result */ Page, Unit] => TesseractJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: /* error */ js.Error => TesseractJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
  }
  
}

