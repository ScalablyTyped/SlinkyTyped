package typingsSlinky.secp256k1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ecdhOptions extends js.Object {
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var hashfn: js.UndefOr[
    js.Function3[
      /* x */ js.typedarray.Uint8Array, 
      /* y */ js.typedarray.Uint8Array, 
      /* data */ js.typedarray.Uint8Array, 
      js.typedarray.Uint8Array
    ]
  ] = js.native
  var xbuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
  var ybuf: js.UndefOr[js.typedarray.Uint8Array] = js.native
}

object ecdhOptions {
  @scala.inline
  def apply(): ecdhOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ecdhOptions]
  }
  @scala.inline
  implicit class ecdhOptionsOps[Self <: ecdhOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHashfn(
      value: (/* x */ js.typedarray.Uint8Array, /* y */ js.typedarray.Uint8Array, /* data */ js.typedarray.Uint8Array) => js.typedarray.Uint8Array
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashfn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHashfn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashfn")(js.undefined)
        ret
    }
    @scala.inline
    def withXbuf(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXbuf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbuf")(js.undefined)
        ret
    }
    @scala.inline
    def withYbuf(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ybuf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYbuf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ybuf")(js.undefined)
        ret
    }
  }
  
}

