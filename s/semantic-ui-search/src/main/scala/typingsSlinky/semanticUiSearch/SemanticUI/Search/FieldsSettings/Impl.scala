package typingsSlinky.semanticUiSearch.SemanticUI.Search.FieldsSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * "view more" object name
    *
    * @default 'action'
    */
  var action: String = js.native
  /**
    * "view more" text
    *
    * @default 'text'
    */
  var actionText: String = js.native
  /**
    * "view more" url
    *
    * @default 'url'
    */
  var actionURL: String = js.native
  /**
    * array of categories (category view)
    *
    * @default 'results'
    */
  var categories: String = js.native
  /**
    * name of category (category view)
    *
    * @default 'name'
    */
  var categoryName: String = js.native
  /**
    * array of results (category view)
    *
    * @default 'results'
    */
  var categoryResults: String = js.native
  /**
    * result description
    *
    * @default 'description'
    */
  var description: String = js.native
  /**
    * result image
    *
    * @default 'image'
    */
  var image: String = js.native
  /**
    * result price
    *
    * @default 'price'
    */
  var price: String = js.native
  /**
    * array of results (standard)
    *
    * @default 'results'
    */
  var results: String = js.native
  /**
    * result title
    *
    * @default 'title'
    */
  var title: String = js.native
}

object Impl {
  @scala.inline
  def apply(
    action: String,
    actionText: String,
    actionURL: String,
    categories: String,
    categoryName: String,
    categoryResults: String,
    description: String,
    image: String,
    price: String,
    results: String,
    title: String
  ): Impl = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actionText = actionText.asInstanceOf[js.Any], actionURL = actionURL.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], categoryName = categoryName.asInstanceOf[js.Any], categoryResults = categoryResults.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategoryResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categoryResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

