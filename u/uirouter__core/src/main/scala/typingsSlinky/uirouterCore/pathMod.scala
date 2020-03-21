package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.commonCommonMod.Predicate
import typingsSlinky.uirouterCore.paramMod.Param
import typingsSlinky.uirouterCore.pathNodeMod.GetParamsFn
import typingsSlinky.uirouterCore.stateMod.StateRegistry
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.targetStateMod.TargetState
import typingsSlinky.uirouterCore.transitionInterfaceMod.TreeChanges
import typingsSlinky.uirouterCore.viewViewMod.ViewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  @js.native
  class PathNode protected ()
    extends typingsSlinky.uirouterCore.pathNodeMod.PathNode {
    /** Creates a copy of a PathNode */
    def this(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode) = this()
    /** Creates a new (empty) PathNode for a State */
    def this(state: StateObject) = this()
  }
  
  @js.native
  class PathUtils ()
    extends typingsSlinky.uirouterCore.pathUtilsMod.PathUtils
  
  /* static members */
  @js.native
  object PathNode extends js.Object {
    /**
      * Returns a clone of the PathNode
      * @deprecated use instance method `node.clone()`
      */
    def clone(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode): typingsSlinky.uirouterCore.pathNodeMod.PathNode = js.native
  }
  
  /* static members */
  @js.native
  object PathUtils extends js.Object {
    /**
      * Creates ViewConfig objects and adds to nodes.
      *
      * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
      */
    def applyViewConfigs(
      $view: ViewService,
      path: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      states: js.Array[StateObject]
    ): Unit = js.native
    def buildPath(targetState: TargetState): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    def buildToPath(fromPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode], targetState: TargetState): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    def equals(
      pathA: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode]
    ): Boolean = js.native
    def equals(
      pathA: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): Boolean = js.native
    /**
      * Given a fromPath and a toPath, returns a new to path which inherits parameters from the fromPath
      *
      * For a parameter in a node to be inherited from the from path:
      * - The toPath's node must have a matching node in the fromPath (by state).
      * - The parameter name must not be found in the toKeys parameter array.
      *
      * Note: the keys provided in toKeys are intended to be those param keys explicitly specified by some
      * caller, for instance, $state.transitionTo(..., toParams).  If a key was found in toParams,
      * it is not inherited from the fromPath.
      */
    def inheritParams(
      fromPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    def inheritParams(
      fromPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      toKeys: js.Array[String]
    ): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    /** Given a PathNode[], create an TargetState */
    def makeTargetState(registry: StateRegistry, path: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode]): TargetState = js.native
    /**
      * Returns a new path which is: the subpath of the first path which matches the second path.
      *
      * The new path starts from root and contains any nodes that match the nodes in the second path.
      * It stops before the first non-matching node.
      *
      * Nodes are compared using their state property and their parameter values.
      * If a `paramsFn` is provided, only the [[Param]] returned by the function will be considered when comparing nodes.
      *
      * @param pathA the first path
      * @param pathB the second path
      * @param paramsFn a function which returns the parameters to consider when comparing
      *
      * @returns an array of PathNodes from the first path which match the nodes in the second path
      */
    def matching(
      pathA: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    def matching(
      pathA: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      pathB: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      paramsFn: GetParamsFn
    ): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    def nonDynamicParams(node: typingsSlinky.uirouterCore.pathNodeMod.PathNode): js.Array[Param] = js.native
    /** Gets the raw parameter values from a path */
    def paramValues(path: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode]): js.Object = js.native
    /**
      * Return a subpath of a path, which stops at the first matching node
      *
      * Given an array of nodes, returns a subset of the array starting from the first node,
      * stopping when the first node matches the predicate.
      *
      * @param path a path of [[PathNode]]s
      * @param predicate a [[Predicate]] fn that matches [[PathNode]]s
      * @returns a subpath up to the matching node, or undefined if no match is found
      */
    def subPath(
      path: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      predicate: Predicate[typingsSlinky.uirouterCore.pathNodeMod.PathNode]
    ): js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode] = js.native
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    def treeChanges(
      fromPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      toPath: js.Array[typingsSlinky.uirouterCore.pathNodeMod.PathNode],
      reloadState: StateObject
    ): TreeChanges = js.native
  }
  
}

