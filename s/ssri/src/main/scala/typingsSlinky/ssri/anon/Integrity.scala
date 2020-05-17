package typingsSlinky.ssri.anon

import typingsSlinky.ssri.mod.HashLike
import typingsSlinky.ssri.mod.IntegrityLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Integrity extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  var integrity: js.UndefOr[String | IntegrityLike | HashLike] = js.native
  var options: js.UndefOr[js.Array[String]] = js.native
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.native
  var single: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object Integrity {
  @scala.inline
  def apply(): Integrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrity]
  }
  @scala.inline
  implicit class IntegrityOps[Self <: Integrity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrity(value: String | IntegrityLike | HashLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrity")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPickAlgorithm(value: (/* algo1 */ String, /* algo2 */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickAlgorithm")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPickAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSingle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("single")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
  }
  
}

