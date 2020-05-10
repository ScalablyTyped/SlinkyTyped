package typingsSlinky.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskOptionsCoreProperties extends js.Object {
  var binding: PrintBinding = js.native
  var collation: PrintCollation = js.native
  var colorMode: PrintColorMode = js.native
  var duplex: PrintDuplex = js.native
  var holePunch: PrintHolePunch = js.native
  var maxCopies: Double = js.native
  var mediaSize: PrintMediaSize = js.native
  var mediaType: PrintMediaType = js.native
  var minCopies: Double = js.native
  var numberOfCopies: Double = js.native
  var orientation: PrintOrientation = js.native
  var printQuality: PrintQuality = js.native
  var staple: PrintStaple = js.native
}

object IPrintTaskOptionsCoreProperties {
  @scala.inline
  def apply(
    binding: PrintBinding,
    collation: PrintCollation,
    colorMode: PrintColorMode,
    duplex: PrintDuplex,
    holePunch: PrintHolePunch,
    maxCopies: Double,
    mediaSize: PrintMediaSize,
    mediaType: PrintMediaType,
    minCopies: Double,
    numberOfCopies: Double,
    orientation: PrintOrientation,
    printQuality: PrintQuality,
    staple: PrintStaple
  ): IPrintTaskOptionsCoreProperties = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], holePunch = holePunch.asInstanceOf[js.Any], maxCopies = maxCopies.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], minCopies = minCopies.asInstanceOf[js.Any], numberOfCopies = numberOfCopies.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionsCoreProperties]
  }
  @scala.inline
  implicit class IPrintTaskOptionsCorePropertiesOps[Self <: IPrintTaskOptionsCoreProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinding(value: PrintBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollation(value: PrintCollation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColorMode(value: PrintColorMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplex(value: PrintDuplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolePunch(value: PrintHolePunch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holePunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCopies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaSize(value: PrintMediaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: PrintMediaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minCopies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfCopies(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfCopies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: PrintOrientation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintQuality(value: PrintQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printQuality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaple(value: PrintStaple): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staple")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

