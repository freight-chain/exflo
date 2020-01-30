/*
 * Copyright (c) 2019 41North.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

pragma solidity >=0.4.25 <0.6.0;

contract Create2OpCodeUnit {

    constructor() public payable {
    }

    function create2OpCode() public {
        assembly {
            let ptr := mload(0x40)
            mstore(ptr, 0x3000000000000000000000000000000000000000000000000000000000000000)

            let salt := 0x0

            pop(create2(100000000000, ptr, 0x20, salt))
        }
    }

}
