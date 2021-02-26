package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.commonCommonMod.Predicate
import typingsSlinky.uirouterCore.paramMod.Param
import typingsSlinky.uirouterCore.pathNodeMod.GetParamsFn
import typingsSlinky.uirouterCore.pathNodeMod.PathNode
import typingsSlinky.uirouterCore.stateMod.StateRegistry
import typingsSlinky.uirouterCore.stateObjectMod.StateObject
import typingsSlinky.uirouterCore.targetStateMod.TargetState
import typingsSlinky.uirouterCore.transitionInterfaceMod.TreeChanges
import typingsSlinky.uirouterCore.viewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathUtilsMod {
  
  @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils")
  @js.native
  class PathUtils () extends StObject
  /* static members */
  object PathUtils {
    
    /**
      * Creates ViewConfig objects and adds to nodes.
      *
      * On each [[PathNode]], creates ViewConfig objects from the views: property of the node's state
      */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.applyViewConfigs")
    @js.native
    def applyViewConfigs($view: ViewService, path: js.Array[PathNode], states: js.Array[StateObject]): Unit = js.native
    
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.buildPath")
    @js.native
    def buildPath(targetState: TargetState): js.Array[PathNode] = js.native
    
    /** Given a fromPath: PathNode[] and a TargetState, builds a toPath: PathNode[] */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.buildToPath")
    @js.native
    def buildToPath(fromPath: js.Array[PathNode], targetState: TargetState): js.Array[PathNode] = js.native
    
    /**
      * Returns true if two paths are identical.
      *
      * @param pathA
      * @param pathB
      * @param paramsFn a function which returns the parameters to consider when comparing
      * @returns true if the the states and parameter values for both paths are identical
      */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.equals")
    @js.native
    def equals(pathA: js.Array[PathNode], pathB: js.Array[PathNode]): Boolean = js.native
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.equals")
    @js.native
    def equals(pathA: js.Array[PathNode], pathB: js.Array[PathNode], paramsFn: GetParamsFn): Boolean = js.native
    
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
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.inheritParams")
    @js.native
    def inheritParams(fromPath: js.Array[PathNode], toPath: js.Array[PathNode]): js.Array[PathNode] = js.native
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.inheritParams")
    @js.native
    def inheritParams(fromPath: js.Array[PathNode], toPath: js.Array[PathNode], toKeys: js.Array[String]): js.Array[PathNode] = js.native
    
    /** Given a PathNode[], create an TargetState */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.makeTargetState")
    @js.native
    def makeTargetState(registry: StateRegistry, path: js.Array[PathNode]): TargetState = js.native
    
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
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.matching")
    @js.native
    def matching(pathA: js.Array[PathNode], pathB: js.Array[PathNode]): js.Array[PathNode] = js.native
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.matching")
    @js.native
    def matching(pathA: js.Array[PathNode], pathB: js.Array[PathNode], paramsFn: GetParamsFn): js.Array[PathNode] = js.native
    
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.nonDynamicParams")
    @js.native
    def nonDynamicParams(node: PathNode): js.Array[Param] = js.native
    
    /** Gets the raw parameter values from a path */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.paramValues")
    @js.native
    def paramValues(path: js.Array[PathNode]): js.Any = js.native
    
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
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.subPath")
    @js.native
    def subPath(path: js.Array[PathNode], predicate: Predicate[PathNode]): js.Array[PathNode] = js.native
    
    /**
      * Computes the tree changes (entering, exiting) between a fromPath and toPath.
      */
    @JSImport("@uirouter/core/lib/path/pathUtils", "PathUtils.treeChanges")
    @js.native
    def treeChanges(fromPath: js.Array[PathNode], toPath: js.Array[PathNode], reloadState: StateObject): TreeChanges = js.native
  }
}
