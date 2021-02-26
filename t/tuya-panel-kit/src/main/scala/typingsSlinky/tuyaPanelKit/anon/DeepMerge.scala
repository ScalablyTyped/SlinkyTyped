package typingsSlinky.tuyaPanelKit.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeepMerge extends StObject {
  
  var ThemeConsumer: ReactElement = js.native
  
  var ThemeProvider: ReactElement = js.native
  
  def deepMerge(target: js.Object, args: js.Object*): js.Object = js.native
  
  def getTheme(props: js.Object, `type`: String, defaultValue: js.Any): js.Any = js.native
  
  def parseToCss(values: js.Array[Double], key: String): StringDictionary[Double] = js.native
  
  def parseToStyle(values: js.Array[Double], key: String): StringDictionary[Double] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  def withTheme[P /* <: Theme[T] */, T](component: ReactComponentClass[P]): ReactComponentClass[P] = js.native
}
object DeepMerge {
  
  @scala.inline
  def apply(
    ThemeConsumer: ReactElement,
    ThemeProvider: ReactElement,
    deepMerge: (js.Object, /* repeated */ js.Object) => js.Object,
    getTheme: (js.Object, String, js.Any) => js.Any,
    parseToCss: (js.Array[Double], String) => StringDictionary[Double],
    parseToStyle: (js.Array[Double], String) => StringDictionary[Double],
    withTheme: ReactComponentClass[js.Any] => ReactComponentClass[js.Any]
  ): DeepMerge = {
    val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], deepMerge = js.Any.fromFunction2(deepMerge), getTheme = js.Any.fromFunction3(getTheme), parseToCss = js.Any.fromFunction2(parseToCss), parseToStyle = js.Any.fromFunction2(parseToStyle), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[DeepMerge]
  }
  
  @scala.inline
  implicit class DeepMergeMutableBuilder[Self <: DeepMerge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeepMerge(value: (js.Object, /* repeated */ js.Object) => js.Object): Self = StObject.set(x, "deepMerge", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetTheme(value: (js.Object, String, js.Any) => js.Any): Self = StObject.set(x, "getTheme", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParseToCss(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToCss", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseToStyle(value: (js.Array[Double], String) => StringDictionary[Double]): Self = StObject.set(x, "parseToStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setThemeConsumer(value: ReactElement): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeProvider(value: ReactElement): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithTheme(value: ReactComponentClass[js.Any] => ReactComponentClass[js.Any]): Self = StObject.set(x, "withTheme", js.Any.fromFunction1(value))
  }
}
