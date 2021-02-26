package typingsSlinky.sizzle

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import typingsSlinky.sizzle.mod.Selectors.AttrHandleFunctions
import typingsSlinky.sizzle.mod.Selectors.CreatePseudoFunction
import typingsSlinky.sizzle.mod.Selectors.FilterFunctions
import typingsSlinky.sizzle.mod.Selectors.FindFunctions
import typingsSlinky.sizzle.mod.Selectors.Matches
import typingsSlinky.sizzle.mod.Selectors.PreFilterFunctions
import typingsSlinky.sizzle.mod.Selectors.PseudoFunction
import typingsSlinky.sizzle.mod.Selectors.PseudoFunctions
import typingsSlinky.sizzle.mod.Selectors.SetFilterFunctions
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("sizzle", JSImport.Namespace)
  @js.native
  val ^ : SizzleStatic = js.native
  
  @js.native
  trait Selectors extends StObject {
    
    var attrHandle: AttrHandleFunctions = js.native
    
    var cacheLength: Double = js.native
    
    def createPseudo(fn: CreatePseudoFunction): PseudoFunction = js.native
    
    var filter: FilterFunctions = js.native
    
    var find: FindFunctions = js.native
    
    var `match`: Matches = js.native
    
    var preFilter: PreFilterFunctions = js.native
    
    var pseudos: PseudoFunctions = js.native
    
    var setFilters: SetFilterFunctions = js.native
  }
  object Selectors {
    
    @scala.inline
    def apply(
      attrHandle: AttrHandleFunctions,
      cacheLength: Double,
      createPseudo: CreatePseudoFunction => PseudoFunction,
      filter: FilterFunctions,
      find: FindFunctions,
      `match`: Matches,
      preFilter: PreFilterFunctions,
      pseudos: PseudoFunctions,
      setFilters: SetFilterFunctions
    ): Selectors = {
      val __obj = js.Dynamic.literal(attrHandle = attrHandle.asInstanceOf[js.Any], cacheLength = cacheLength.asInstanceOf[js.Any], createPseudo = js.Any.fromFunction1(createPseudo), filter = filter.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], preFilter = preFilter.asInstanceOf[js.Any], pseudos = pseudos.asInstanceOf[js.Any], setFilters = setFilters.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selectors]
    }
    
    type AttrHandleFunction = js.Function3[/* elem */ js.Any, /* casePreservedName */ String, /* isXML */ Boolean, String]
    
    type AttrHandleFunctions = StringDictionary[AttrHandleFunction]
    
    type CreatePseudoFunction = js.Function1[/* repeated */ js.Any, PseudoFunction]
    
    type FilterFunction = js.Function2[/* element */ String, /* repeated */ String, Boolean]
    
    type FilterFunctions = StringDictionary[FilterFunction]
    
    type FindFunction = js.Function3[
        /* match */ RegExpMatchArray, 
        /* context */ Element | Document, 
        /* isXML */ Boolean, 
        js.Array[Element] | Unit
      ]
    
    type FindFunctions = StringDictionary[FindFunction]
    
    type Matches = StringDictionary[js.RegExp]
    
    type PreFilterFunction = js.Function1[/* match */ RegExpMatchArray, js.Array[String]]
    
    type PreFilterFunctions = StringDictionary[PreFilterFunction]
    
    type PseudoFunction = js.Function1[/* elem */ Element, Boolean]
    
    type PseudoFunctions = StringDictionary[PseudoFunction]
    
    @scala.inline
    implicit class SelectorsMutableBuilder[Self <: Selectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrHandle(value: AttrHandleFunctions): Self = StObject.set(x, "attrHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheLength(value: Double): Self = StObject.set(x, "cacheLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatePseudo(value: CreatePseudoFunction => PseudoFunction): Self = StObject.set(x, "createPseudo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(value: FilterFunctions): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFind(value: FindFunctions): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: Matches): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreFilter(value: PreFilterFunctions): Self = StObject.set(x, "preFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPseudos(value: PseudoFunctions): Self = StObject.set(x, "pseudos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetFilters(value: SetFilterFunctions): Self = StObject.set(x, "setFilters", value.asInstanceOf[js.Any])
    }
    
    type SetFilterFunction = js.Function3[
        /* elements */ js.Array[Element], 
        /* argument */ Double, 
        /* not */ Boolean, 
        js.Array[Element]
      ]
    
    type SetFilterFunctions = StringDictionary[SetFilterFunction]
  }
  
  @js.native
  trait SizzleStatic extends StObject {
    
    def apply(selector: String): js.Array[Element] = js.native
    def apply(selector: String, context: Document): js.Array[Element] = js.native
    def apply(selector: String, context: DocumentFragment): js.Array[Element] = js.native
    def apply(selector: String, context: Element): js.Array[Element] = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: DocumentFragment, results: TArrayLike): TArrayLike = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Document, results: TArrayLike): TArrayLike = js.native
    def apply[TArrayLike /* <: ArrayLike[Element] */](selector: String, context: Element, results: TArrayLike): TArrayLike = js.native
    
    // tslint:disable-next-line:ban-types
    def compile(selector: String): js.Function = js.native
    
    def matchSelector(element: Element, selector: String): Boolean = js.native
    
    def matches(selector: String, elements: js.Array[Element]): js.Array[Element] = js.native
    
    var selectors: Selectors = js.native
  }
  
  type _To = SizzleStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: SizzleStatic = ^
}
