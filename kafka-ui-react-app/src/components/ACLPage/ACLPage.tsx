import React, { useState } from 'react';
import { Routes, Route } from 'react-router-dom';
import styled from 'styled-components';
import ACList from 'components/ACLPage/List/List';
import { Input } from 'components/common/Input/Input.styled'; // Assuming this is the styled component used in Topics

const SearchInputWrapper = styled.div`
  display: flex;
  justify-content: flex-start; /* Align to the left */
  margin-bottom: 20px;
`;

const StyledInput = styled(Input)`
  width: 33.33%; // Adjust the width to one-third
`;

const ACLPage = () => {
  const [searchTerm, setSearchTerm] = useState('');

  return (
    <>
      <h1>Access Control List</h1>
      <SearchInputWrapper>
        <StyledInput
          type="text"
          placeholder="Search ACLs"
          value={searchTerm}
          onChange={(e) => setSearchTerm(e.target.value)}
        />
      </SearchInputWrapper>
      <Routes>
        <Route index element={<ACList searchTerm={searchTerm} />} />
      </Routes>
    </>
  );
};

export default ACLPage;
