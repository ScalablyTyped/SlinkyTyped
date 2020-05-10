package typingsSlinky.sketchapp

import typingsSlinky.sketchapp.sketchappStrings.assetCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSDocumentAssets extends js.Object {
  var _class: assetCollection = js.native
  var colors: js.Array[_] = js.native
  var gradients: js.Array[_] = js.native
  var imageCollection: SketchMSImageCollection = js.native
  var images: js.Array[_] = js.native
}

object SketchMSDocumentAssets {
  @scala.inline
  def apply(
    _class: assetCollection,
    colors: js.Array[_],
    gradients: js.Array[_],
    imageCollection: SketchMSImageCollection,
    images: js.Array[_]
  ): SketchMSDocumentAssets = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], imageCollection = imageCollection.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocumentAssets]
  }
  @scala.inline
  implicit class SketchMSDocumentAssetsOps[Self <: SketchMSDocumentAssets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_class(value: assetCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradients(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageCollection(value: SketchMSImageCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCollection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

