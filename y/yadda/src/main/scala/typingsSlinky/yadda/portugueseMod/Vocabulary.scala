package typingsSlinky.yadda.portugueseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vocabulary
  extends typingsSlinky.yadda.englishMod.Vocabulary {
  var dada: String = js.native
  var dadas: String = js.native
  var dado: String = js.native
  var dados: String = js.native
  var entao: String = js.native
  var quando: String = js.native
  var se: String = js.native
  var seja: String = js.native
  var sejam: String = js.native
}

object Vocabulary {
  @scala.inline
  def apply(
    _steps: js.Array[String],
    background: String,
    dada: String,
    dadas: String,
    dado: String,
    dados: String,
    entao: String,
    examples: String,
    feature: String,
    given: String,
    only: String,
    pending: String,
    quando: String,
    scenario: String,
    se: String,
    seja: String,
    sejam: String,
    `then`: String,
    when: String
  ): Vocabulary = {
    val __obj = js.Dynamic.literal(_steps = _steps.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], dada = dada.asInstanceOf[js.Any], dadas = dadas.asInstanceOf[js.Any], dado = dado.asInstanceOf[js.Any], dados = dados.asInstanceOf[js.Any], entao = entao.asInstanceOf[js.Any], examples = examples.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], given = given.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], quando = quando.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], seja = seja.asInstanceOf[js.Any], sejam = sejam.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
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
    def withDada(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dada")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDadas(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dadas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDado(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dado")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDados(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dados")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntao(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entao")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuando(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quando")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("se")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeja(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seja")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSejam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sejam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

