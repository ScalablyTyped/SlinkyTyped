package typingsSlinky.webcola

import typingsSlinky.webcola.anon.Groups
import typingsSlinky.webcola.linklengthsMod.LinkAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powergraphMod {
  
  @JSImport("webcola/dist/src/powergraph", "Configuration")
  @js.native
  class Configuration[Link] protected () extends StObject {
    def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
    def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[_]) = this()
    
    var R: Double = js.native
    
    def allEdges(): js.Array[PowerEdge] = js.native
    
    def getGroupHierarchy(retargetedEdges: js.Array[PowerEdge]): js.Array[_] = js.native
    
    def greedyMerge(): Boolean = js.native
    
    var initModulesFromGroup: js.Any = js.native
    
    var linkAccessor: js.Any = js.native
    
    def merge(a: Module, b: Module): Module = js.native
    def merge(a: Module, b: Module, k: Double): Module = js.native
    
    var modules: js.Array[Module] = js.native
    
    var nEdges: js.Any = js.native
    
    var rootMerges: js.Any = js.native
    
    var roots: js.Array[ModuleSet] = js.native
  }
  /* static members */
  object Configuration {
    
    @JSImport("webcola/dist/src/powergraph", "Configuration.getEdges")
    @js.native
    def getEdges(modules: ModuleSet, es: js.Array[PowerEdge]): Unit = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "LinkSets")
  @js.native
  class LinkSets () extends StObject {
    
    def add(linktype: Double, m: Module): Unit = js.native
    
    def contains(id: Double): Boolean = js.native
    
    def count(): Double = js.native
    
    def forAll(f: js.Function2[/* ms */ ModuleSet, /* linktype */ Double, Unit]): Unit = js.native
    
    def forAllModules(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
    
    def intersection(other: LinkSets): LinkSets = js.native
    
    var n: Double = js.native
    
    def remove(linktype: Double, m: Module): Unit = js.native
    
    var sets: js.Any = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "Module")
  @js.native
  class Module protected () extends StObject {
    def this(id: Double) = this()
    def this(id: Double, outgoing: LinkSets) = this()
    def this(id: Double, outgoing: js.UndefOr[scala.Nothing], incoming: LinkSets) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets) = this()
    def this(
      id: Double,
      outgoing: js.UndefOr[scala.Nothing],
      incoming: js.UndefOr[scala.Nothing],
      children: ModuleSet
    ) = this()
    def this(id: Double, outgoing: js.UndefOr[scala.Nothing], incoming: LinkSets, children: ModuleSet) = this()
    def this(id: Double, outgoing: LinkSets, incoming: js.UndefOr[scala.Nothing], children: ModuleSet) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet) = this()
    def this(
      id: Double,
      outgoing: js.UndefOr[scala.Nothing],
      incoming: js.UndefOr[scala.Nothing],
      children: js.UndefOr[scala.Nothing],
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: js.UndefOr[scala.Nothing],
      incoming: js.UndefOr[scala.Nothing],
      children: ModuleSet,
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: js.UndefOr[scala.Nothing],
      incoming: LinkSets,
      children: js.UndefOr[scala.Nothing],
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: js.UndefOr[scala.Nothing],
      incoming: LinkSets,
      children: ModuleSet,
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: LinkSets,
      incoming: js.UndefOr[scala.Nothing],
      children: js.UndefOr[scala.Nothing],
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: LinkSets,
      incoming: js.UndefOr[scala.Nothing],
      children: ModuleSet,
      definition: js.Any
    ) = this()
    def this(
      id: Double,
      outgoing: LinkSets,
      incoming: LinkSets,
      children: js.UndefOr[scala.Nothing],
      definition: js.Any
    ) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet, definition: js.Any) = this()
    
    var children: ModuleSet = js.native
    
    var definition: js.UndefOr[js.Any] = js.native
    
    def getEdges(es: js.Array[PowerEdge]): Unit = js.native
    
    var gid: Double = js.native
    
    var id: Double = js.native
    
    var incoming: LinkSets = js.native
    
    def isIsland(): Boolean = js.native
    
    def isLeaf(): Boolean = js.native
    
    def isPredefined(): Boolean = js.native
    
    var outgoing: LinkSets = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "ModuleSet")
  @js.native
  class ModuleSet () extends StObject {
    
    def add(m: Module): Unit = js.native
    
    def contains(id: Double): Boolean = js.native
    
    def count(): Double = js.native
    
    def forAll(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
    
    def intersection(other: ModuleSet): ModuleSet = js.native
    
    def intersectionCount(other: ModuleSet): Double = js.native
    
    def modules(): js.Array[Module] = js.native
    
    def remove(m: Module): Unit = js.native
    
    var table: js.Any = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "PowerEdge")
  @js.native
  class PowerEdge protected () extends StObject {
    def this(source: js.Any, target: js.Any, `type`: Double) = this()
    
    var source: js.Any = js.native
    
    var target: js.Any = js.native
    
    var `type`: Double = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "getGroups")
  @js.native
  def getGroups[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link]): Groups = js.native
  @JSImport("webcola/dist/src/powergraph", "getGroups")
  @js.native
  def getGroups[Link](nodes: js.Array[_], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[_]): Groups = js.native
  
  @js.native
  trait LinkTypeAccessor[Link] extends LinkAccessor[Link] {
    
    def getType(l: Link): Double = js.native
  }
  object LinkTypeAccessor {
    
    @scala.inline
    def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, getType: Link => Double): LinkTypeAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
      __obj.asInstanceOf[LinkTypeAccessor[Link]]
    }
    
    @scala.inline
    implicit class LinkTypeAccessorMutableBuilder[Self <: LinkTypeAccessor[_], Link] (val x: Self with LinkTypeAccessor[Link]) extends AnyVal {
      
      @scala.inline
      def setGetType(value: Link => Double): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    }
  }
}
