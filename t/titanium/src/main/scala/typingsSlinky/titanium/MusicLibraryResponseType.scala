package typingsSlinky.titanium

import typingsSlinky.titanium.Titanium.Media.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object passed to the [openMusicLibrary](Titanium.Media.openMusicLibrary)
  * `success` callback function.
  */
@js.native
trait MusicLibraryResponseType extends js.Object {
  /**
  	 * A list of all the items chosen by the user.
  	 */
  var items: js.UndefOr[js.Array[Item]] = js.native
  /**
  	 * A single representative of the selected items.
  	 */
  var representative: js.UndefOr[Item] = js.native
  /**
  	 * Media types in this collection, represented as the bitwise OR of the media type
  	 * values for all media types represented in `items`.
  	 */
  var types: js.UndefOr[Double] = js.native
}

object MusicLibraryResponseType {
  @scala.inline
  def apply(): MusicLibraryResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MusicLibraryResponseType]
  }
  @scala.inline
  implicit class MusicLibraryResponseTypeOps[Self <: MusicLibraryResponseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[Item]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresentative(value: Item): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresentative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(js.undefined)
        ret
    }
    @scala.inline
    def withTypes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(js.undefined)
        ret
    }
  }
  
}

