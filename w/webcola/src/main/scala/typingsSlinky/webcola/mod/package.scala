package typingsSlinky.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ConvexHull(S: js.Array[typingsSlinky.webcola.geomMod.Point]): js.Array[typingsSlinky.webcola.geomMod.Point] = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ConvexHull")(S.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.webcola.geomMod.Point]]
  
  @scala.inline
  def LLtangentPolyPolyC(V: js.Array[typingsSlinky.webcola.geomMod.Point], W: js.Array[typingsSlinky.webcola.geomMod.Point]): typingsSlinky.webcola.anon.T1 = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("LLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.T1]
  
  @scala.inline
  def LRtangentPolyPolyC(V: js.Array[typingsSlinky.webcola.geomMod.Point], W: js.Array[typingsSlinky.webcola.geomMod.Point]): typingsSlinky.webcola.anon.T1 = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("LRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.T1]
  
  @scala.inline
  def RLtangentPolyPolyC(V: js.Array[typingsSlinky.webcola.geomMod.Point], W: js.Array[typingsSlinky.webcola.geomMod.Point]): typingsSlinky.webcola.anon.T1 = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RLtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.T1]
  
  @scala.inline
  def RRtangentPolyPolyC(V: js.Array[typingsSlinky.webcola.geomMod.Point], W: js.Array[typingsSlinky.webcola.geomMod.Point]): typingsSlinky.webcola.anon.T1 = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("RRtangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.T1]
  
  @scala.inline
  def adaptor(options: js.Any): typingsSlinky.webcola.adaptorMod.LayoutAdaptor = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.webcola.adaptorMod.LayoutAdaptor]
  
  @scala.inline
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyPacking(
    graphs: js.Array[_],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: js.UndefOr[scala.Nothing],
    centerGraph: scala.Boolean
  ): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyPacking(graphs: js.Array[_], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: scala.Double): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def applyPacking(
    graphs: js.Array[_],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: scala.Double,
    centerGraph: scala.Boolean
  ): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def clockwiseRadialSweep(
    p: typingsSlinky.webcola.geomMod.Point,
    P: js.Array[typingsSlinky.webcola.geomMod.Point],
    f: js.Function1[/* p */ typingsSlinky.webcola.geomMod.Point, scala.Unit]
  ): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("clockwiseRadialSweep")(p.asInstanceOf[js.Any], P.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def computeGroupBounds(g: typingsSlinky.webcola.rectangleMod.ProjectionGroup): typingsSlinky.webcola.rectangleMod.Rectangle = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("computeGroupBounds")(g.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.webcola.rectangleMod.Rectangle]
  
  @scala.inline
  def d3adaptor(): typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")().asInstanceOf[typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]
  @scala.inline
  def d3adaptor(d3Context: typingsSlinky.webcola.d3adaptorMod.D3v3Context): typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]
  @scala.inline
  def d3adaptor(d3Context: typingsSlinky.webcola.d3v4adaptorMod.D3Context): typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.webcola.layoutMod.Layout with typingsSlinky.webcola.d3adaptorMod.ID3StyleLayoutAdaptor]
  
  @scala.inline
  def generateDirectedEdgeConstraints[Link](
    n: scala.Double,
    links: js.Array[Link],
    axis: java.lang.String,
    la: typingsSlinky.webcola.linklengthsMod.LinkSepAccessor[Link]
  ): js.Array[typingsSlinky.webcola.linklengthsMod.IConstraint] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateDirectedEdgeConstraints")(n.asInstanceOf[js.Any], links.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.webcola.linklengthsMod.IConstraint]]
  
  @scala.inline
  def generateXConstraints(
    rs: js.Array[typingsSlinky.webcola.rectangleMod.Rectangle],
    vars: js.Array[typingsSlinky.webcola.vpscMod.Variable]
  ): js.Array[typingsSlinky.webcola.vpscMod.Constraint] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateXConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.webcola.vpscMod.Constraint]]
  
  @scala.inline
  def generateXGroupConstraints(root: typingsSlinky.webcola.rectangleMod.ProjectionGroup): js.Array[typingsSlinky.webcola.vpscMod.Constraint] = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateXGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.webcola.vpscMod.Constraint]]
  
  @scala.inline
  def generateYConstraints(
    rs: js.Array[typingsSlinky.webcola.rectangleMod.Rectangle],
    vars: js.Array[typingsSlinky.webcola.vpscMod.Variable]
  ): js.Array[typingsSlinky.webcola.vpscMod.Constraint] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateYConstraints")(rs.asInstanceOf[js.Any], vars.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsSlinky.webcola.vpscMod.Constraint]]
  
  @scala.inline
  def generateYGroupConstraints(root: typingsSlinky.webcola.rectangleMod.ProjectionGroup): js.Array[typingsSlinky.webcola.vpscMod.Constraint] = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateYGroupConstraints")(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.webcola.vpscMod.Constraint]]
  
  @scala.inline
  def getGroups[Link](
    nodes: js.Array[_],
    links: js.Array[Link],
    la: typingsSlinky.webcola.powergraphMod.LinkTypeAccessor[Link]
  ): typingsSlinky.webcola.anon.Groups = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.Groups]
  @scala.inline
  def getGroups[Link](
    nodes: js.Array[_],
    links: js.Array[Link],
    la: typingsSlinky.webcola.powergraphMod.LinkTypeAccessor[Link],
    rootGroup: js.Array[_]
  ): typingsSlinky.webcola.anon.Groups = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], rootGroup.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.Groups]
  
  @scala.inline
  def gridify(pgLayout: js.Any, nudgeGap: scala.Double, margin: scala.Double, groupMargin: scala.Double): js.Array[js.Array[js.Array[typingsSlinky.webcola.geomMod.Point]]] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gridify")(pgLayout.asInstanceOf[js.Any], nudgeGap.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], groupMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[typingsSlinky.webcola.geomMod.Point]]]]
  
  @scala.inline
  def isLeft(
    P0: typingsSlinky.webcola.geomMod.Point,
    P1: typingsSlinky.webcola.geomMod.Point,
    P2: typingsSlinky.webcola.geomMod.Point
  ): scala.Double = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(P0.asInstanceOf[js.Any], P1.asInstanceOf[js.Any], P2.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def jaccardLinkLengths[Link](links: js.Array[Link], la: typingsSlinky.webcola.linklengthsMod.LinkLengthAccessor[Link]): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def jaccardLinkLengths[Link](
    links: js.Array[Link],
    la: typingsSlinky.webcola.linklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def makeEdgeBetween(
    source: typingsSlinky.webcola.rectangleMod.Rectangle,
    target: typingsSlinky.webcola.rectangleMod.Rectangle,
    ah: scala.Double
  ): typingsSlinky.webcola.anon.ArrowStart = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeBetween")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.ArrowStart]
  
  @scala.inline
  def makeEdgeTo(
    s: typingsSlinky.webcola.anon.X,
    target: typingsSlinky.webcola.rectangleMod.Rectangle,
    ah: scala.Double
  ): typingsSlinky.webcola.geomMod.Point = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeEdgeTo")(s.asInstanceOf[js.Any], target.asInstanceOf[js.Any], ah.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.geomMod.Point]
  
  @scala.inline
  def polysOverlap(p: js.Array[typingsSlinky.webcola.geomMod.Point], q: js.Array[typingsSlinky.webcola.geomMod.Point]): scala.Boolean = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polysOverlap")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def powerGraphGridLayout(graph: typingsSlinky.webcola.anon.Links, size: js.Array[scala.Double], grouppadding: scala.Double): typingsSlinky.webcola.anon.Cola = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("powerGraphGridLayout")(graph.asInstanceOf[js.Any], size.asInstanceOf[js.Any], grouppadding.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.Cola]
  
  @scala.inline
  def removeOverlapInOneDimension(spans: js.Array[typingsSlinky.webcola.anon.DesiredCenter]): typingsSlinky.webcola.anon.LowerBound = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.webcola.anon.LowerBound]
  @scala.inline
  def removeOverlapInOneDimension(
    spans: js.Array[typingsSlinky.webcola.anon.DesiredCenter],
    lowerBound: js.UndefOr[scala.Nothing],
    upperBound: scala.Double
  ): typingsSlinky.webcola.anon.LowerBound = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.LowerBound]
  @scala.inline
  def removeOverlapInOneDimension(spans: js.Array[typingsSlinky.webcola.anon.DesiredCenter], lowerBound: scala.Double): typingsSlinky.webcola.anon.LowerBound = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.LowerBound]
  @scala.inline
  def removeOverlapInOneDimension(
    spans: js.Array[typingsSlinky.webcola.anon.DesiredCenter],
    lowerBound: scala.Double,
    upperBound: scala.Double
  ): typingsSlinky.webcola.anon.LowerBound = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlapInOneDimension")(spans.asInstanceOf[js.Any], lowerBound.asInstanceOf[js.Any], upperBound.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.LowerBound]
  
  @scala.inline
  def removeOverlaps(rs: js.Array[typingsSlinky.webcola.rectangleMod.Rectangle]): scala.Unit = typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeOverlaps")(rs.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def separateGraphs(nodes: js.Any, links: js.Any): js.Array[_] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("separateGraphs")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[js.Array[_]]
  
  @scala.inline
  def stronglyConnectedComponents[Link](
    numVertices: scala.Double,
    edges: js.Array[Link],
    la: typingsSlinky.webcola.linklengthsMod.LinkAccessor[Link]
  ): js.Array[js.Array[scala.Double]] = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stronglyConnectedComponents")(numVertices.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[scala.Double]]]
  
  @scala.inline
  def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: typingsSlinky.webcola.linklengthsMod.LinkLengthAccessor[Link]): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def symmetricDiffLinkLengths[Link](
    links: js.Array[Link],
    la: typingsSlinky.webcola.linklengthsMod.LinkLengthAccessor[Link],
    w: scala.Double
  ): scala.Unit = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def tangentPolyPolyC(
    V: js.Array[typingsSlinky.webcola.geomMod.Point],
    W: js.Array[typingsSlinky.webcola.geomMod.Point],
    t1: js.Function2[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.geomMod.Point], 
      scala.Double
    ],
    t2: js.Function2[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ js.Array[typingsSlinky.webcola.geomMod.Point], 
      scala.Double
    ],
    cmp1: js.Function3[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ typingsSlinky.webcola.geomMod.Point, 
      /* c */ typingsSlinky.webcola.geomMod.Point, 
      scala.Boolean
    ],
    cmp2: js.Function3[
      /* a */ typingsSlinky.webcola.geomMod.Point, 
      /* b */ typingsSlinky.webcola.geomMod.Point, 
      /* c */ typingsSlinky.webcola.geomMod.Point, 
      scala.Boolean
    ]
  ): typingsSlinky.webcola.anon.T1 = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tangent_PolyPolyC")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any], t1.asInstanceOf[js.Any], t2.asInstanceOf[js.Any], cmp1.asInstanceOf[js.Any], cmp2.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.anon.T1]
  
  @scala.inline
  def tangents(V: js.Array[typingsSlinky.webcola.geomMod.Point], W: js.Array[typingsSlinky.webcola.geomMod.Point]): typingsSlinky.webcola.geomMod.BiTangents = (typingsSlinky.webcola.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tangents")(V.asInstanceOf[js.Any], W.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.webcola.geomMod.BiTangents]
}
