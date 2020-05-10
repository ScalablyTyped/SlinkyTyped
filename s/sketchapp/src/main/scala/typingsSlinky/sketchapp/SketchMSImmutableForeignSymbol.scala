package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.MSImmutableForeignSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSImmutableForeignSymbol extends js.Object {
  var _class: MSImmutableForeignSymbol = js.native
  var libraryID: String = js.native
  var originalMaster: SketchMSSymbolMasterLayer = js.native
  var sourceLibraryName: String = js.native
  var symbolMaster: SketchMSSymbolMasterLayer = js.native
  var symbolPrivate: Boolean = js.native
}

object SketchMSImmutableForeignSymbol {
  @scala.inline
  def apply(
    _class: MSImmutableForeignSymbol,
    libraryID: String,
    originalMaster: SketchMSSymbolMasterLayer,
    sourceLibraryName: String,
    symbolMaster: SketchMSSymbolMasterLayer,
    symbolPrivate: Boolean
  ): SketchMSImmutableForeignSymbol = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], libraryID = libraryID.asInstanceOf[js.Any], originalMaster = originalMaster.asInstanceOf[js.Any], sourceLibraryName = sourceLibraryName.asInstanceOf[js.Any], symbolMaster = symbolMaster.asInstanceOf[js.Any], symbolPrivate = symbolPrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImmutableForeignSymbol]
  }
  @scala.inline
  implicit class SketchMSImmutableForeignSymbolOps[Self <: SketchMSImmutableForeignSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: MSImmutableForeignSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLibraryID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("libraryID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalMaster(value: SketchMSSymbolMasterLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceLibraryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceLibraryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolMaster(value: SketchMSSymbolMasterLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolMaster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbolPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbolPrivate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

