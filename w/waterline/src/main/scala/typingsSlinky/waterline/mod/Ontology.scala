package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ontology extends js.Object {
  var collections: js.Any = js.native
}

object Ontology {
  @scala.inline
  def apply(collections: js.Any): Ontology = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ontology]
  }
  @scala.inline
  implicit class OntologyOps[Self <: Ontology] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollections(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

