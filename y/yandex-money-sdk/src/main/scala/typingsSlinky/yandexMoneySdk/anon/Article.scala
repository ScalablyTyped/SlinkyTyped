package typingsSlinky.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Article extends js.Object {
  var article: js.Array[MerchantArticleId] = js.native
  var bonus: js.Array[Secret] = js.native
}

object Article {
  @scala.inline
  def apply(article: js.Array[MerchantArticleId], bonus: js.Array[Secret]): Article = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
  @scala.inline
  implicit class ArticleOps[Self <: Article] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArticle(value: js.Array[MerchantArticleId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("article")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBonus(value: js.Array[Secret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bonus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

