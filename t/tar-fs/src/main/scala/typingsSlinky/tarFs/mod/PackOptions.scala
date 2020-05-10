package typingsSlinky.tarFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackOptions extends Options {
  var dereference: js.UndefOr[Boolean] = js.native
  var entries: js.UndefOr[js.Array[String]] = js.native
  @JSName("finalize")
  var finalize_FPackOptions: js.UndefOr[Boolean] = js.native
  var finish: js.UndefOr[js.Function1[/* pack */ typingsSlinky.tarStream.mod.Pack_, Unit]] = js.native
  var pack: js.UndefOr[typingsSlinky.tarStream.mod.Pack_] = js.native
}

object PackOptions {
  @scala.inline
  def apply(): PackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackOptions]
  }
  @scala.inline
  implicit class PackOptionsOps[Self <: PackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDereference(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDereference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dereference")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.undefined)
        ret
    }
    @scala.inline
    def withFinish(value: /* pack */ typingsSlinky.tarStream.mod.Pack_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.undefined)
        ret
    }
    @scala.inline
    def withPack(value: typingsSlinky.tarStream.mod.Pack_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pack")(js.undefined)
        ret
    }
  }
  
}

