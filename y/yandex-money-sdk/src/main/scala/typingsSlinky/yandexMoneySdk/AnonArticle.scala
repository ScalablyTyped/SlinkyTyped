package typingsSlinky.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArticle extends js.Object {
  var article: js.Array[AnonMerchantArticleId] = js.native
  var bonus: js.Array[AnonSecret] = js.native
}

object AnonArticle {
  @scala.inline
  def apply(article: js.Array[AnonMerchantArticleId], bonus: js.Array[AnonSecret]): AnonArticle = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArticle]
  }
  @scala.inline
  implicit class AnonArticleOps[Self <: AnonArticle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArticle(value: js.Array[AnonMerchantArticleId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBonus(value: js.Array[AnonSecret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bonus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

