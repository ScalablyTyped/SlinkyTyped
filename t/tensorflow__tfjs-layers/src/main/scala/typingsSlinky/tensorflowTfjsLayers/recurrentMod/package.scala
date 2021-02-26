package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object recurrentMod {
  
  @scala.inline
  def generateDropoutMask(args: typingsSlinky.tensorflowTfjsLayers.anon.Count): typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ]) = typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("generateDropoutMask")(args.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ])]
  
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: js.UndefOr[scala.Nothing],
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: js.UndefOr[scala.Nothing],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.UndefOr[scala.Nothing],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: js.UndefOr[scala.Nothing],
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  @scala.inline
  def rnn(
    stepFunction: typingsSlinky.tensorflowTfjsLayers.distTypesMod.RnnStepFunction,
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    initialStates: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    goBackwards: scala.Boolean,
    mask: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank],
    constants: js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ],
    unroll: scala.Boolean,
    needPerStepOutputs: scala.Boolean
  ): js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ] = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(stepFunction.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], initialStates.asInstanceOf[js.Any], goBackwards.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], unroll.asInstanceOf[js.Any], needPerStepOutputs.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank], 
    js.Array[
      typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]
  ]]
  
  @scala.inline
  def standardizeArgs(
    inputs: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
    initialState: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
    constants: typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank] | (js.Array[
      typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor | typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
    ]) | typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor,
    numConstants: js.UndefOr[scala.Double]
  ): typingsSlinky.tensorflowTfjsLayers.anon.Constants = (typingsSlinky.tensorflowTfjsLayers.recurrentMod.^.asInstanceOf[js.Dynamic].applyDynamic("standardizeArgs")(inputs.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], constants.asInstanceOf[js.Any], numConstants.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.tensorflowTfjsLayers.anon.Constants]
}
