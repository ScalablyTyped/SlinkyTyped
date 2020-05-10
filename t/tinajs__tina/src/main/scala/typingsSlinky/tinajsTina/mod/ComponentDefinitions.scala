package typingsSlinky.tinajsTina.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tinajsTina.PartialComponentDefinitio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDefinitions extends ComponentLifecycles {
  var data: StringDictionary[js.Any] = js.native
  var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = js.native
  var mixins: js.Array[PartialComponentDefinitio] = js.native
  var properties: ComponentProperties = js.native
  def compute(data: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: () => Unit,
    compute: StringDictionary[js.Any] => StringDictionary[js.Any],
    created: () => Unit,
    data: StringDictionary[js.Any],
    detached: () => Unit,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
    mixins: js.Array[PartialComponentDefinitio],
    moved: () => Unit,
    properties: ComponentProperties,
    ready: () => Unit
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data.asInstanceOf[js.Any], detached = js.Any.fromFunction0(detached), methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], moved = js.Any.fromFunction0(moved), properties = properties.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
    __obj.asInstanceOf[ComponentDefinitions]
  }
  @scala.inline
  implicit class ComponentDefinitionsOps[Self <: ComponentDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompute(value: StringDictionary[js.Any] => StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMixins(value: js.Array[PartialComponentDefinitio]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: ComponentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

