package typingsSlinky.styletronReact.mod

import slinky.core.ReactComponentClass
import typingsSlinky.styletronStandard.mod.StandardEngine
import typingsSlinky.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styletron extends js.Object {
  
  var base: StyletronBase = js.native
  
  var debug: js.UndefOr[typingsSlinky.styletronReact.anon.StackIndex] = js.native
  
  var driver: StyletronDriver = js.native
  
  var getInitialStyle: StyletronGetInitialStyle = js.native
  
  var reducers: js.Array[ReducerContainer] = js.native
  
  var wrapper: StyletronWrapper = js.native
}
object Styletron {
  
  @scala.inline
  def apply(
    base: StyletronBase,
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    reducers: js.Array[ReducerContainer],
    wrapper: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), reducers = reducers.asInstanceOf[js.Any], wrapper = js.Any.fromFunction1(wrapper))
    __obj.asInstanceOf[Styletron]
  }
  
  @scala.inline
  implicit class StyletronOps[Self <: Styletron] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseFunctionComponent(value: ReactComponentClass[js.Any]): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseComponentClass(value: ReactComponentClass[js.Any]): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: StyletronBase): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriver(value: (/* style */ StyleObject, /* styletron */ StandardEngine) => String): Self = this.set("driver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetInitialStyle(value: () => StyleObject): Self = this.set("getInitialStyle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReducersVarargs(value: ReducerContainer*): Self = this.set("reducers", js.Array(value :_*))
    
    @scala.inline
    def setReducers(value: js.Array[ReducerContainer]): Self = this.set("reducers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapper(value: /* fc */ ReactComponentClass[js.Any] => ReactComponentClass[js.Any]): Self = this.set("wrapper", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebug(value: typingsSlinky.styletronReact.anon.StackIndex): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
  }
}
