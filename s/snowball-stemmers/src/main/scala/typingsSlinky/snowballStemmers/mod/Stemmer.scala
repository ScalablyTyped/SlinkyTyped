package typingsSlinky.snowballStemmers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stemmer extends js.Object {
  def stem(term: String): String = js.native
}

object Stemmer {
  @scala.inline
  def apply(stem: String => String): Stemmer = {
    val __obj = js.Dynamic.literal(stem = js.Any.fromFunction1(stem))
    __obj.asInstanceOf[Stemmer]
  }
  @scala.inline
  implicit class StemmerOps[Self <: Stemmer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStem(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stem")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

