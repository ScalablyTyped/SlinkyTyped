package typingsSlinky.winrtUwp.Windows.Graphics.Printing

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of methods and properties for managing the options which define how the content is to be printed. */
@js.native
trait PrintTaskOptions extends js.Object {
  /** Gets or sets the binding option for the print task. */
  var binding: PrintBinding = js.native
  /** Gets or sets the collation option of the print tasks. */
  var collation: PrintCollation = js.native
  /** Gets or sets the color mode option of the print task. */
  var colorMode: PrintColorMode = js.native
  /** Gets the list of options displayed for the print experience. */
  var displayedOptions: IVector[String] = js.native
  /** Gets or sets the duplex option of the print task. */
  var duplex: PrintDuplex = js.native
  /** Gets or sets the hole punch option of the print task. */
  var holePunch: PrintHolePunch = js.native
  /** Gets the maximum number of copies supported for the print task. */
  var maxCopies: Double = js.native
  /** Gets or sets the media size option of the print task. */
  var mediaSize: PrintMediaSize = js.native
  /** Gets or sets the media type option for the print task. */
  var mediaType: PrintMediaType = js.native
  /** Gets the minimum number of copies allowed for the print task. */
  var minCopies: Double = js.native
  /** Gets or sets the value for the number of copies for the print task. */
  var numberOfCopies: Double = js.native
  /** Gets or sets the orientation option for the print task. */
  var orientation: PrintOrientation = js.native
  /** Gets or sets the print quality option for the print task. */
  var printQuality: PrintQuality = js.native
  /** Gets or sets the staple option for the print task. */
  var staple: PrintStaple = js.native
  /**
    * Retrieves the physical dimensions of the printed page.
    * @param jobPageNumber The page number.
    * @return The page description data.
    */
  def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

object PrintTaskOptions {
  @scala.inline
  def apply(
    binding: PrintBinding,
    collation: PrintCollation,
    colorMode: PrintColorMode,
    displayedOptions: IVector[String],
    duplex: PrintDuplex,
    getPageDescription: Double => PrintPageDescription,
    holePunch: PrintHolePunch,
    maxCopies: Double,
    mediaSize: PrintMediaSize,
    mediaType: PrintMediaType,
    minCopies: Double,
    numberOfCopies: Double,
    orientation: PrintOrientation,
    printQuality: PrintQuality,
    staple: PrintStaple
  ): PrintTaskOptions = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], displayedOptions = displayedOptions.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], getPageDescription = js.Any.fromFunction1(getPageDescription), holePunch = holePunch.asInstanceOf[js.Any], maxCopies = maxCopies.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], minCopies = minCopies.asInstanceOf[js.Any], numberOfCopies = numberOfCopies.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptions]
  }
  @scala.inline
  implicit class PrintTaskOptionsOps[Self <: PrintTaskOptions] (val x: Self) extends AnyVal {
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
    def withDisplayedOptions(value: IVector[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuplex(value: PrintDuplex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPageDescription(value: Double => PrintPageDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageDescription")(js.Any.fromFunction1(value))
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

