// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT license.
package com.microsoft.sampleandroid;

public class CoarseRelocSettings {
    /// Whitelist of Bluetooth-LE beacons used to find anchors and improve the locatability
    /// of existing anchors.
    /// Add the UUIDs for your own Bluetooth beacons here to use them with Azure Spatial Anchors.
    public static final String[] KNOWN_BLUETOOTH_PROXIMITY_UUIDS = {
        "61687109-905f-4436-91f8-e602f514c96d",
        "e1f54e02-1e23-44e0-9c3d-512eb56adec9",
        "01234567-8901-2345-6789-012345678903",
    };
}
