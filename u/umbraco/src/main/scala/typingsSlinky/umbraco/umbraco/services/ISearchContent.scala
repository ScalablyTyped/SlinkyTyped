package typingsSlinky.umbraco.umbraco.services

import typingsSlinky.umbraco.AnonUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search content
  */
@js.native
trait ISearchContent extends js.Object {
  var editorPath: String = js.native
  var id: Double = js.native
  var menuUrl: String = js.native
  var metaData: AnonUrl = js.native
  var subTitle: String = js.native
}

object ISearchContent {
  @scala.inline
  def apply(editorPath: String, id: Double, menuUrl: String, metaData: AnonUrl, subTitle: String): ISearchContent = {
    val __obj = js.Dynamic.literal(editorPath = editorPath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], menuUrl = menuUrl.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchContent]
  }
  @scala.inline
  implicit class ISearchContentOps[Self <: ISearchContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditorPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaData(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

