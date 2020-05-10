package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandardPrintTaskOptionsStatic extends js.Object {
  var binding: String = js.native
  var collation: String = js.native
  var colorMode: String = js.native
  var copies: String = js.native
  var duplex: String = js.native
  var holePunch: String = js.native
  var inputBin: String = js.native
  var mediaSize: String = js.native
  var mediaType: String = js.native
  var nUp: String = js.native
  var orientation: String = js.native
  var printQuality: String = js.native
  var staple: String = js.native
}

object IStandardPrintTaskOptionsStatic {
  @scala.inline
  def apply(
    binding: String,
    collation: String,
    colorMode: String,
    copies: String,
    duplex: String,
    holePunch: String,
    inputBin: String,
    mediaSize: String,
    mediaType: String,
    nUp: String,
    orientation: String,
    printQuality: String,
    staple: String
  ): IStandardPrintTaskOptionsStatic = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], copies = copies.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], holePunch = holePunch.asInstanceOf[js.Any], inputBin = inputBin.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], nUp = nUp.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStandardPrintTaskOptionsStatic]
  }
  @scala.inline
  implicit class IStandardPrintTaskOptionsStaticOps[Self <: IStandardPrintTaskOptionsStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCopies(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolePunch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holePunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputBin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputBin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNUp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintQuality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaple(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

