package typingsSlinky.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Waterline extends js.Object {
  var collections: js.Any = js.native
  def initialize(config: Config, cb: js.Function2[/* err */ js.Error, /* ontology */ Ontology, _]): js.Any = js.native
  def loadCollection(collection: CollectionClass): Unit = js.native
}

object Waterline {
  @scala.inline
  def apply(
    collections: js.Any,
    initialize: (Config, js.Function2[/* err */ js.Error, /* ontology */ Ontology, _]) => js.Any,
    loadCollection: CollectionClass => Unit
  ): Waterline = {
    val __obj = js.Dynamic.literal(collections = collections.asInstanceOf[js.Any], initialize = js.Any.fromFunction2(initialize), loadCollection = js.Any.fromFunction1(loadCollection))
    __obj.asInstanceOf[Waterline]
  }
  @scala.inline
  implicit class WaterlineOps[Self <: Waterline] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withInitialize(value: (Config, js.Function2[/* err */ js.Error, /* ontology */ Ontology, _]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLoadCollection(value: CollectionClass => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadCollection")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

