package typingsSlinky.yadda.frenchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vocabulary
  extends typingsSlinky.yadda.englishMod.Vocabulary {
  var alors: String = js.native
  var etantdonnalors: String = js.native
  var etantdonnalorss: String = js.native
  var etantdonne: String = js.native
  var lorsque: String = js.native
  var quand: String = js.native
  var soit: String = js.native
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    alors: String,
    background: String,
    etantdonnalors: String,
    etantdonnalorss: String,
    etantdonne: String,
    examples: String,
    feature: String,
    given: String,
    lorsque: String,
    only: String,
    pending: String,
    quand: String,
    scenario: String,
    soit: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], alors = alors.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], etantdonnalors = etantdonnalors.asInstanceOf[js.Any], etantdonnalorss = etantdonnalorss.asInstanceOf[js.Any], etantdonne = etantdonne.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], lorsque = lorsque.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], quand = quand.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], soit = soit.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vocabulary]
  }
  @scala.inline
  implicit class VocabularyOps[Self <: Vocabulary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtantdonnalors(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etantdonnalors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtantdonnalorss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etantdonnalorss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtantdonne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etantdonne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLorsque(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lorsque")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

